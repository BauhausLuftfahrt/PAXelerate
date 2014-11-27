package net.bhl.cdt.model.cabin.ui;

import org.eclipse.swt.graphics.Color;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.CabinFactory;
import net.bhl.cdt.model.cabin.Curtain;
import net.bhl.cdt.model.cabin.Door;
import net.bhl.cdt.model.cabin.Galley;
import net.bhl.cdt.model.cabin.Lavatory;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerClass;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.Row;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

/**
 * 
 * @author marc.engelmann
 * 
 * @version 1.0
 * 
 * @date 18.11.2014
 *
 */

public class CabinViewPart extends ViewPart {
	public Cabin drawCabin;
	public int cabin_y;
	public double factor;
	public String drawString;
	double xPositionPassenger;
	double yPositionPassenger;
	int lastPosx = 0;
	int lastPosy = 0;
	int idPassenger;
	ArrayList<int[]> colorList = new ArrayList<int[]>();
	// ArrayList<double[][][]> PassengerPositions;
	public Cabin cabinPlaceHolder = CabinFactory.eINSTANCE.createCabin();
	Composite parent;
	
	/*********** graphics settings *********/
	public int doorsOutOfCabinPixels;
	double sizeOfPassengerCircle; /*
								 * value between 0 and 1. Depending on the seat
								 * size
								 */
	/*************************************/

	/***** image-properties *****/
	int cabin_x;// 96 /*width of cabin in the image in pixels*/
	int x_zero; // 138 /*defined left upper point of cabin in pixels*/
	int y_zero;// 90 /*defined left upper point of cabin in pixels*/
	int doorDepth; /*
					 * defines the door depth in pixels. Only important for
					 * graphics
					 */
	/**************************/

	/**Create Colors and Fonts here*/
	int fontsize; 
	String fontName; 
	Color gold; 
	Color blue; 
	Color red; 
	Color gray; 
	Color salmon;
	Color green; 
	Color light_gray; 
	Color dark_gray; 
	Color white; 
	Color black;

	Font fontOne; 
	Font fontTwo;
	Font fontThree; 

	DecimalFormat df;
	/*******************************/

	int oneMeter;
	
	Image image;
	Canvas canvas;

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			Cabin todo = (Cabin) obj;
			return todo.getName();
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	/**
	 * * This is a callback that will allow us to create the viewer and
	 * initialize * it.
	 */

	public void createPartControl(Composite parent) {
		this.parent = parent;
		drawCabin = CabinFactory.eINSTANCE.createCabin();
		// drawCabin.setGraphicSettings(CabinFactory.eINSTANCE.createCabinViewSettings());

		/*********** graphics settings *********/
		doorsOutOfCabinPixels = 0; // drawCabin.getGraphicSettings().getDoorOffSetInPixels();
		sizeOfPassengerCircle = 0.75; // drawCabin.getGraphicSettings().getSizeOfPassengerCircle(); // /*value between 0 and 1. Depending on the seat size*/
		/*************************************/

		/***** image-properties *****/
		cabin_x = 96; // drawCabin.getGraphicSettings().getCabinWidthInPixels();
						// //96 /*width of cabin in the image in pixels*/
		x_zero = 138; // drawCabin.getGraphicSettings().getXZeroInPixels(); //
						// 138 /*defined left upper point of cabin in pixels*/
		y_zero = 90; // drawCabin.getGraphicSettings().getYZeroInPixels(); // 90
						// /*defined left upper point of cabin in pixels*/
		doorDepth = 2; /* in pixels */
		/**************************/

		oneMeter = 47;
		
		/************************* Create Colors and Fonts here *******************************/
		fontsize = 6;
		fontName = "Helvetica Neue";
		gold = new Color(parent.getDisplay(), 255, 215, 0);
		blue = new Color(parent.getDisplay(), 30, 144, 255);
		red = new Color(parent.getDisplay(), 220, 20, 60);
		gray = new Color(parent.getDisplay(), 169, 169, 169);
		salmon = new Color(parent.getDisplay(), 250, 128, 114);
		green = new Color(parent.getDisplay(), 50, 205, 50);
		light_gray = new Color(parent.getDisplay(), 220, 220, 220);
		dark_gray = new Color(parent.getDisplay(), 105, 105, 105);
		white = new Color(parent.getDisplay(), 255, 255, 255);
		black = new Color(parent.getDisplay(), 0, 0, 0);

		fontOne = new Font(parent.getDisplay(), fontName, 8, SWT.NORMAL);
		fontTwo = new Font(parent.getDisplay(), fontName, fontsize, SWT.NORMAL);
		fontThree = new Font(parent.getDisplay(), fontName, 9, SWT.NORMAL);

		df = new DecimalFormat("####0.00");
		/*************************************************************************************/
		
		image = new Image(parent.getDisplay(),
				"T:\\Marc Engelmann\\aircraft_images\\lh_a320_cut.PNG");

		canvas = new Canvas(parent, SWT.RESIZE);
		doTheDraw();
		

	}

	public void submitCabin(Cabin cabin) {
		drawCabin = cabin;
		doTheDraw();
	}
	
	public void submitObstacleMap(final int[][] obstacleMap) {
		
		parent.redraw();
		parent.update();
		canvas.redraw();		
		canvas.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent e) {		
				e.gc.setAlpha(100);
				//drawCabin.setScale(20);
				for(int i = 0;i<(int)(drawCabin.getCabinWidth()/drawCabin.getScale());i++) {
					for(int j = 0;j<(int)(drawCabin.getCabinLength()/drawCabin.getScale());j++) {
						if(obstacleMap[i][j]==0) {
							e.gc.setBackground(green);
						} else {
							e.gc.setBackground(red);
						}
						
						// Color depiction depending on value 255 -> 0 and vice versa.
						
						e.gc.fillOval(x_zero+(int)(i*drawCabin.getScale()/factor),y_zero+(int)(j*drawCabin.getScale()/factor),(int)(2*drawCabin.getScale()/factor),(int)(2*drawCabin.getScale()/factor));
					} 
				}
							
			}			
		});
	}
	
	
	public void submitPath(final ArrayList<int[][]> pathList) {
		parent.redraw();
		parent.update();
		canvas.redraw();
		
		canvas.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent e) {		
				e.gc.setLineWidth(2);
				for(int l = 0; l<pathList.size();l++) {
					final int[][] singlePath = pathList.get(l);
					//System.out.println(l+" -> Length: "+singlePath.length);		
					int[] pathPoints = new int[2*singlePath.length];
					int k = 0;
					int i = 0;
					//int[] pathPoints = {0,0,100,100,200,200,200,400,400,200};
					while(k < 2*singlePath.length) {
						//System.out.println("k = "+k);
						pathPoints[k] = x_zero + (int)(singlePath[i][0]*drawCabin.getScale()/factor);
						//System.out.println("pathPoint(k) = "+pathPoints[k]);
						pathPoints[k+1] = y_zero + (int)(singlePath[i][1]*drawCabin.getScale()/factor);
						//System.out.println("pathPoint(k+1) = "+pathPoints[k+1]);
						k = k+2;
						i++;
					}
					e.gc.drawPolyline(pathPoints);	
					pathPoints = null;
				}
				e.gc.setLineWidth(1);
		}
		});
	}
	

	public void submitPassengerCoordinates(final Cabin paxCabin) {

		parent.redraw();
		parent.update();
		canvas.redraw();
		canvas.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent e) {
				
//				e.gc.setAdvanced(true);
//				Transform transform = new Transform(parentTest.getDisplay());
//				//float cos45 = (float)Math.cos(45);
//		        float cos45 = (float)Math.cos(Math.PI/4); 
//		        //float sin45 = (float)Math.sin(45);
//		        float sin45 = (float)Math.sin(Math.PI/4);
//		        transform.setElements(cos45, sin45, -sin45, cos45, 0, 0);
//				transform.rotate(45);
//				transform.translate(100, - 141);
//				e.gc.drawText("HALLO!",100,100);
//				e.gc.setTransform(transform);
//				e.gc.drawText("HALLO!",100,100);
//				transform.dispose();
				for (Passenger pass : ModelHelper.getChildrenByClass(paxCabin,Passenger.class)) {
					int[] color = calculateColor(pass);
					e.gc.setBackground(new Color(e.display, color[0], color[1], color[2]));
					if(!pass.isIsSeated()) {
						if(!((pass.getPositionX()==0)&&(pass.getPositionY()==0))) {
							e.gc.fillOval(
									x_zero + (int) ((pass.getPositionX()-pass.getWidth()/2) / factor),
									y_zero + (int) ((pass.getPositionY()-pass.getDepth()/2) / factor),
									(int)(pass.getWidth()/factor), (int)(pass.getDepth()/factor));
						}
					}
					else { 
						Seat mySeat = pass.getSeatRef();
						e.gc.fillOval(
					    x_zero + (int) ((mySeat.getXPosition()+mySeat.getWidth()/2-pass.getWidth()/2) / factor),
						y_zero + (int) ((mySeat.getYPosition()+mySeat.getLength()/2-pass.getDepth()/2) / factor),
						(int)(pass.getWidth()/factor), (int)(pass.getDepth()/factor));
						
					}
				}
				
			}
			 
				//e.gc.dispose();
			
		});
	}

	public void doTheDraw() {

		factor = drawCabin.getCabinWidth() / cabin_x;

		parent.redraw();
		parent.update();
		canvas.redraw();
		if (drawCabin.getClasses().isEmpty()) {
			cabin_y = 636;
		} else {
			cabin_y = (int) (drawCabin.getCabinLength() / factor);
		}

		canvas.addPaintListener(new PaintListener() {
			public void paintControl(final PaintEvent e) {
				e.gc.drawImage(image, 0, 0);
				e.gc.setAlpha(255);

				

				e.gc.setFont(fontOne);
				e.gc.setBackground(white);

				List<Seat> seatList = ModelHelper.getChildrenByClass(drawCabin,
						Seat.class);
				List<Row> rowList = ModelHelper.getChildrenByClass(drawCabin,
						Row.class);
				ArrayList<Row> rowCountList = new ArrayList<Row>();
				List<Passenger> paxList = ModelHelper.getChildrenByClass(
						drawCabin, Passenger.class);

				/*********************************** Info Box ******************************************/
				e.gc.drawRectangle(20, 20, 70, 60);
				e.gc.drawText("Seats " + "\nRows " + "\nPax ", 30, 30);
				e.gc.drawText(":\n:\n:", 60, 30);
				e.gc.drawText(seatList.size() + "\n" + rowList.size() + "\n"
						+ paxList.size(), 65, 30);
				/*************************************************************************************/

				/*********************************** Scale Box *****************************************/
				int xbegin = 40;
				int ybegin = 122;
				int eckenBreite = 1;
				int meter = 1;
				if (!drawCabin.getClasses().isEmpty()) {
					oneMeter = (int) (cabin_x * 100 / drawCabin.getCabinWidth());
				}
				e.gc.drawText(
						"1px = "
								+ df.format(drawCabin.getCabinWidth() / cabin_x)
								+ " cm", 20, 100);
				if (oneMeter > 20) {
					meter = 1;
				} else if (oneMeter > 10) {
					meter = 2;
				} else {
					meter = 3;
				}
				e.gc.drawText(meter + "m", 20, 115);
				e.gc.drawLine(xbegin, ybegin, xbegin + oneMeter * meter, ybegin);
				e.gc.drawLine(xbegin, ybegin - eckenBreite, xbegin, ybegin
						+ eckenBreite);
				e.gc.drawLine(xbegin + oneMeter * meter, ybegin - eckenBreite,
						xbegin + oneMeter * meter, ybegin + eckenBreite);
				/*************************************************************************************/

				/********************************* Coordinate Box **************************************/
				int originy = 20;
				int originx = 320;
				int length = 20;
				int triangleHeight = 5;
				int triangleWidth = 6;
				int correctionOfXPosition = 4;
				int correctionOfYPosition = 7;
				int distanceOfXToLine = 15;
				int distanceOfYToLine = 10;
				int radiusOfZAxisCircle = 4;
				int[] xTriangle = { originx + length + triangleHeight, originy,
						originx + length, originy - (int) (triangleWidth / 2),
						originx + length, originy + (int) (triangleWidth / 2) };
				int[] yTriangle = { originx, originy + length + triangleHeight,
						originx - (int) (triangleWidth / 2), originy + length,
						originx + (int) (triangleWidth / 2), originy + length };

				e.gc.setBackground(black);
				e.gc.drawLine(originx, originy, originx, originy + length);
				e.gc.drawLine(originx, originy, originx + length, originy);
				e.gc.fillPolygon(xTriangle);
				e.gc.fillPolygon(yTriangle);
				e.gc.drawOval(originx - (int) (radiusOfZAxisCircle / 2),
						originy - (int) (radiusOfZAxisCircle / 2),
						radiusOfZAxisCircle, radiusOfZAxisCircle);
				e.gc.setBackground(white);
				e.gc.drawText("x", originx + (int) (length / 2)
						- correctionOfXPosition, originy - distanceOfXToLine);
				e.gc.drawText("y", originx - distanceOfYToLine, originy
						+ (int) (length / 2) - correctionOfYPosition);
				/*************************************************************************************/

				e.gc.setFont(fontTwo);
				e.gc.setBackground(light_gray);
				e.gc.fillRectangle(x_zero, y_zero, cabin_x, cabin_y);

				if (!drawCabin.getClasses().isEmpty()) {
					for (Seat seat : ModelHelper.getChildrenByClass(drawCabin,
							Seat.class)) {
						PassengerClass pasClass = ModelHelper.getParent(
								PassengerClass.class, seat);

						switch (pasClass.getType()) {
						default:
							e.gc.setBackground(gray);
							break;
						case BUSINESS:
							e.gc.setBackground(blue);
							break;
						case FIRST:
							e.gc.setBackground(red);
							break;
						case PREMIUM_ECO:
							e.gc.setBackground(gold);
							break;

						}
						e.gc.fillRectangle((int) (x_zero + seat.getXPosition()
								/ factor), (int) (y_zero + seat.getYPosition()
								/ factor), (int) (seat.getWidth() / factor),
								(int) (seat.getLength() / factor));

						// if(drawCabin.getGraphicSettings().isShowSeatlabels())
						// {
						e.gc.drawText(
								"" + seat.getLetter(),
								(int) (x_zero - fontsize * 0.7 + (seat
										.getXPosition() + seat.getWidth() / 2)
										/ factor),
								(int) (y_zero - 0.9 * fontsize + (seat
										.getYPosition() + seat.getLength() / 2)
										/ factor));
						// }
						// if(drawCabin.getGraphicSettings().isShowRowLabels())
						// {
						Row row = CabinFactory.eINSTANCE.createRow();
						row = ModelHelper.getParent(Row.class, seat);
						if (!rowCountList.contains(row)) {
							e.gc.setBackground(light_gray);
							e.gc.drawText(
									"" + row.getRowNumber(),
									(int) (x_zero - 5 + drawCabin
											.getCabinWidth() / 2 / factor),
									(int) (y_zero - fontsize + (seat
											.getYPosition() + seat.getLength() / 2)
											/ factor));
							rowCountList.add(row);
						}
						// }
					}

					// if(drawCabin.getGraphicSettings().isShowDoors()) {
					for (Door door : ModelHelper.getChildrenByClass(drawCabin,
							Door.class)) {
						e.gc.setBackground(dark_gray);
						if (door.isOnBothSides()) {
							e.gc.fillRectangle(
									(int) (x_zero + doorsOutOfCabinPixels
											- doorDepth + (drawCabin
											.getCabinWidth()) / factor),
									(int) (y_zero + door.getYPosition()
											/ factor), (int) (doorDepth),
									(int) (door.getWidth() / factor));
						}
						e.gc.fillRectangle(
								(int) (x_zero - doorsOutOfCabinPixels),
								(int) (y_zero + door.getYPosition() / factor),
								(int) (doorDepth),
								(int) (door.getWidth() / factor));
					}
					// }

					// if(drawCabin.getGraphicSettings().isShowLavatories()) {
					for (Lavatory lavatory : ModelHelper.getChildrenByClass(
							drawCabin, Lavatory.class)) {
						e.gc.setBackground(salmon);
						e.gc.fillRectangle(
								(int) (x_zero + lavatory.getXPosition()
										/ factor),
								(int) (y_zero + lavatory.getYPosition()
										/ factor),
								(int) (lavatory.getXDimension() / factor),
								(int) (lavatory.getYDimension() / factor));
						// if(drawCabin.getGraphicSettings().isShowGalleyAndLavatoryLabels())
						// {
						e.gc.drawText(
								"WC",
								(int) (x_zero - fontsize + (lavatory
										.getXPosition() + lavatory
										.getXDimension() / 2)
										/ factor),
								(int) (y_zero - fontsize + (lavatory
										.getYPosition() + lavatory
										.getYDimension() / 2)
										/ factor));
						// }
					}
					// }

					// if(drawCabin.getGraphicSettings().isShowGalleys()) {
					for (Galley galley : ModelHelper.getChildrenByClass(
							drawCabin, Galley.class)) {
						e.gc.setBackground(green);
						e.gc.fillRectangle(
								(int) (x_zero + galley.getXPosition() / factor),
								(int) (y_zero + galley.getYPosition() / factor),
								(int) (galley.getXDimension() / factor),
								(int) (galley.getYDimension() / factor));
						// if(drawCabin.getGraphicSettings().isShowGalleyAndLavatoryLabels())
						// {
						e.gc.drawText(
								"Galley",
								(int) (x_zero - fontsize - 8 + (galley
										.getXPosition() + galley
										.getXDimension() / 2)
										/ factor),
								(int) (y_zero - fontsize + (galley
										.getYPosition() + galley
										.getYDimension() / 2)
										/ factor));
						// }
					}
					// }

					// if(drawCabin.getGraphicSettings().isShowLavatories()) {
					for (Curtain curtain : ModelHelper.getChildrenByClass(
							drawCabin, Curtain.class)) {
						e.gc.setBackground(e.display
								.getSystemColor(SWT.COLOR_BLACK));
						if (curtain.isCurtainOpen()) {
							e.gc.fillRectangle(
									(int) (x_zero + curtain.getXPosition()
											/ factor),
									(int) (y_zero + curtain.getYPosition()
											/ factor),
									(int) (curtain.getXDimension() / factor),
									(int) (curtain.getYDimension() / factor));
							e.gc.fillRectangle(
									(int) (x_zero + (drawCabin.getCabinWidth()
											- curtain.getXPosition() - curtain
												.getXDimension()) / factor),
									(int) (y_zero + curtain.getYPosition()
											/ factor),
									(int) (curtain.getXDimension() / factor),
									(int) (curtain.getYDimension() / factor));
						} else {
							e.gc.fillRectangle(
									(int) (x_zero + curtain.getXPosition()
											/ factor),
									(int) (y_zero + curtain.getYPosition()
											/ factor),
									(int) (drawCabin.getCabinWidth() / factor),
									(int) (curtain.getYDimension() / factor));
						}
					}
					// }

					if (!drawCabin.getPassengers().isEmpty()) { // &&drawCabin.getGraphicSettings().isShowOccupiedSeats())
																// {
						for (Passenger passenger : ModelHelper
								.getChildrenByClass(drawCabin, Passenger.class)) {
							Seat passengerSeat = passenger.getSeatRef();
							int[] colorCode = calculateColor(passenger);
							e.gc.setBackground(new Color(e.display,
									colorCode[0], colorCode[1], colorCode[2]));

							if (passengerSeat.getLength() < passengerSeat
									.getWidth()) {
								e.gc.fillOval(
										(int) (x_zero + (passengerSeat
												.getXPosition()
												+ passengerSeat.getWidth() / 2 - passengerSeat
												.getLength()
												* sizeOfPassengerCircle / 2)
												/ factor),
										(int) (y_zero + (passengerSeat
												.getYPosition() + (1 - sizeOfPassengerCircle)
												* passengerSeat.getLength() / 2)
												/ factor),
										(int) (sizeOfPassengerCircle
												* passengerSeat.getLength() / factor),
										(int) (sizeOfPassengerCircle
												* passengerSeat.getLength() / factor));
								// e.gc.drawOval((int)(x_zero+(passengerSeat.getXPosition()+passengerSeat.getWidth()/2-passengerSeat.getLength()*sizeOfPassengerCircle/2)/factor),(int)(y_zero
								// +(passengerSeat.getYPosition()+(1-sizeOfPassengerCircle)*passengerSeat.getLength()/2)/factor),(int)(sizeOfPassengerCircle*passengerSeat.getLength()/factor),(int)(sizeOfPassengerCircle*passengerSeat.getLength()/factor));
							} else {
								e.gc.fillOval(
										(int) (x_zero + (passengerSeat
												.getXPosition() + (1 - sizeOfPassengerCircle)
												* passengerSeat.getWidth() / 2)
												/ factor),
										(int) (y_zero + (passengerSeat
												.getYPosition()
												+ passengerSeat.getLength() / 2 - passengerSeat
												.getWidth()
												* sizeOfPassengerCircle / 2)
												/ factor),
										(int) (sizeOfPassengerCircle
												* passengerSeat.getWidth() / factor),
										(int) (sizeOfPassengerCircle
												* passengerSeat.getWidth() / factor));
								// e.gc.drawOval((int)(x_zero+(passengerSeat.getXPosition()+(1-sizeOfPassengerCircle)*passengerSeat.getWidth()/2)/factor),(int)(y_zero
								// +(passengerSeat.getYPosition()+passengerSeat.getLength()/2-passengerSeat.getWidth()*sizeOfPassengerCircle/2)/factor),(int)(sizeOfPassengerCircle*passengerSeat.getWidth()/factor),(int)(sizeOfPassengerCircle*passengerSeat.getWidth()/factor));
							}
						}
					}

				} else {

					e.gc.setFont(fontThree);
					e.gc.setBackground(e.display.getSystemColor(SWT.COLOR_RED));
					e.gc.fillRectangle(38, 370, 300, 35);
					e.gc.drawText(
							"Please refresh cabin view or generate a new cabin!",
							50, 380);
				}
				//e.gc.dispose();
			}

		});
	}

	public int[] calculateColor(Passenger pax) {
		int[] color = new int[3];
		int randInt = pax.getId() % 6;
		int colorDefine = (pax.getId() % 13) * 20 + 15;
		switch (randInt) {
		case 0:
			color[0] = 255;
			color[1] = 0;
			color[2] = colorDefine;
			break;
		case 1:
			color[0] = 255;
			color[1] = colorDefine;
			color[2] = 0;
			break;
		case 2:
			color[0] = 0;
			color[1] = 255;
			color[2] = colorDefine;
			break;
		case 3:
			color[0] = colorDefine;
			color[1] = 255;
			color[2] = 0;
			break;
		case 4:
			color[0] = 0;
			color[1] = colorDefine;
			color[2] = 255;
			break;
		case 5:
			color[0] = colorDefine;
			color[1] = 0;
			color[2] = 255;
			break;
		default:
			color[0] = 255;
			color[1] = 255;
			color[2] = 255;
			break;
		}

		return color;
	}

	/** * Passing the focus request to the viewer's control. */
	public void setFocus() {
	}

}