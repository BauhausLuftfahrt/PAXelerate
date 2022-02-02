///*******************************************************************************
// * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
// * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
// * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
// *******************************************************************************/
//
//package com.paxelerate.ui.parts;
//
//
///**
// * This class represents the heat map view.
// *
// * @author Marc.Engelmann
// */
//
//public class HeatmapPart extends BHLPart {
//
//	// UI margin in pixels
//	private static final int MARGIN = 20;
//
//	private boolean showCost = true;
//	private List<Costmap> costmaps = new ArrayList<>();
//
//	private Areamap areamap;
//	private int costChoose = 1;
//	private int areamapChoose = 0;
//	Layer layer = Layer.ASTAR;
//	private double MIN_CEILING_HEIGHT = 1.5;
//
//	private List<List<IntVector>> goals = new ArrayList<>();
//	private Deck deck;
//
//	private BHLCanvas canvas;
//
//	/**
//	 * @param costmaps
//	 * @param goals
//	 */
//	public void submitData(List<Costmap> costmaps, List<List<IntVector>> goals, Areamap areamap, Deck deck) {
//
//		this.goals = goals;
//		this.costmaps = costmaps;
//		this.areamap = areamap;
//		this.deck = deck;
//
//		canvas.redraw();
//	}
//
//	@Override
//	public void didReceiveModel() {
//		// do nothing
//	}
//
//	/**
//	 */
//	private void generateImage(GC gc) {
//
//		if (deck == null) {
//			return;
//		}
//
//		final IntVector dimensions = new IntVector(
//				BHLMath.toInt(DeckExtensions.getMaximumSize(deck).getX()
//						/ EObjectHelper.getParent(Model.class, deck).getSettings().getSimulationGridResolution()),
//				BHLMath.toInt(DeckExtensions.getMaximumSize(deck).getY()
//						/ EObjectHelper.getParent(Model.class, deck).getSettings().getSimulationGridResolution()));
//
//		gc.setAlpha(255);
//		BHLGC.setQuality(gc, false);
//
//		gc.setBackground(BHLColors.BLACK);
//		gc.fillRectangle(canvas.getBounds());
//
//		gc.setFont(new Font(parent.getDisplay(), "Arial", 7, 0));
//		gc.setForeground(BHLColors.WHITE);
//
//		canvas.adaptScaling(dimensions.getX(), dimensions.getY(), MARGIN);
//
//		double overlap = 0.85;
//
//		final int diameter = (int) (overlap * canvas.uiScale < 1 ? 1 : overlap * canvas.uiScale);
//
//		// Costmap show!
//		if (showCost && !costmaps.isEmpty()) {
//
//			double maximum = costmaps.get(costChoose - 1).getMaximumCost();
//
////			try {
////				CSVExport export = new CSVExport("costmap_export", DataKeys.EXPORT_PATH, false);
////				for (int i = 0; i < dimensions.getX(); i++) {
////					for (int j = 0; j < dimensions.getY(); j++) {
////
////						IntVector pos = new IntVector(i, j);
////						Integer cost = costmaps.get(costChoose - 1).getCost(pos);
////
////						export.add("" + j, (cost == null ? "-1" : cost));
////					}
////				}
////				export.saveFile(true);
////
////			} catch (IOException e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
//
//			/***************************************************/
//
//			for (int i = 0; i < dimensions.getX(); i++) {
//				for (int j = 0; j < dimensions.getY(); j++) {
//
//					IntVector pos = new IntVector(i, j);
//
//					Integer cost = costmaps.get(costChoose - 1).getCost(pos);
//
//					if (cost != null) {
//
//						gc.setBackground(BHLColors.getGreenToBlueGradient(cost, maximum));
//						gc.fillOval(BHLMath.toInt(pos.getX() * canvas.uiScale + canvas.uiOffset.getX()),
//								BHLMath.toInt(pos.getY() * canvas.uiScale + canvas.uiOffset.getY()), diameter,
//								diameter);
//					}
//
//				}
//			}
//
//			gc.setBackground(BHLColors.WHITE);
//
//			for (IntVector point : goals.get(costChoose - 1)) {
//
//				gc.fillOval(BHLMath.toInt(point.getX() * canvas.uiScale + canvas.uiOffset.getX()),
//						BHLMath.toInt(point.getY() * canvas.uiScale + canvas.uiOffset.getY()), 2 * diameter,
//						2 * diameter);
//			}
//
//		} else {
//
//			for (int p = 0; p < dimensions.getX(); p++) {
//				for (int j = 0; j < dimensions.getY(); j++) {
//
//					Node node = areamap.get(p, j).get();
//
//					// for ceiling layer show ceiling height, not obstacles
//					if (layer == Layer.CEILING) {
//						gc.setBackground(BHLColors.getGreenToRedGradient(
//								Math.abs(node.getStandardCeilingHeight() - node.getCeilingHeight()),
//								Math.abs(node.getStandardCeilingHeight() - MIN_CEILING_HEIGHT)));
//					} else {
//
//						switch (node.getProperty(layer)) {
//						case FREE:
//
//							if (node.getObstacleGradientValue(layer) <= ObstacleGenerator.HOLE_VALUE_AISLE
//									|| node.getObstacleGradientValue(layer) <= ObstacleGenerator.DEFAULT_VALUE) {
////								gc.setBackground(BHLColors.GREEN_DARK);
//								gc.setBackground(BHLColors.BLACK);
//
//							} else {
//								gc.setBackground(BHLColors.YELLOW);
//							}
//							break;
//
//						case FUSELAGE:
//							continue;
//
//						case OBJECT:
//							gc.setBackground(BHLColors.RED);
//							break;
//						}
//					}
//
//					gc.fillOval(BHLMath.toInt(p * canvas.uiScale + canvas.uiOffset.getX()),
//							BHLMath.toInt(j * canvas.uiScale + canvas.uiOffset.getY()), diameter, diameter);
//				}
//			}
//
//		}
//
//		// -----------------------------------------------------------------
//		// Passenger paths
//
//		if (showCost == true || areamapChoose == 0) {
//			gc.setBackground(BHLColors.WHITE);
////			gc.setBackground(BHLColors.GREEN_DARK);
//
//			List<IntVector> pathPoints = new ArrayList<>();
//			List<Double> speedOnPath = new ArrayList<>();
//
//			double min = 0;
//			double max = Integer.MAX_VALUE;
//
//			if (!goals.isEmpty()) {
//				min = goals.get(costChoose - 1).stream().mapToDouble(IntVector::getX).min().orElse(0);
//				max = goals.get(costChoose - 1).stream().mapToDouble(IntVector::getX).max().orElse(Integer.MAX_VALUE);
//			}
//
//			for (Passenger passenger : deck.getPassengers()) {
//
//				for (EPoint vec : passenger.getPath()) {
//					IntVector intVec = new IntVector(BHLMath.toInt(vec.getX()), BHLMath.toInt(vec.getY()));
//					if (!pathPoints.contains(intVec)) {
//						pathPoints.add(intVec);
//					}
//				}
//
//				for (Double speeds : passenger.getSpeedOnPath()) {
//					speedOnPath.add(speeds);
//				}
//			}
//
//			// variable to get speed on path value
//			int i = 0;
//
//			for (IntVector vec : pathPoints) {
//
//				if (vec.getX() < min || vec.getX() > max) {
//					continue;
//				}
//
//				if (showCost == true || i >= speedOnPath.size() || speedOnPath == null) {
//					gc.setBackground(BHLColors.WHITE);
//				} else {
////						gc.setBackground(BHLColors.getWhiteToBlackGradient(speedOnPath.get(i)));
//					gc.setBackground(BHLColors.getGreenToBlueGradient(speedOnPath.get(i), 1));
//					i += 1;
//				}
//
//				gc.fillOval(BHLMath.toInt(vec.getX() * canvas.uiScale + canvas.uiOffset.getX()),
//						BHLMath.toInt(vec.getY() * canvas.uiScale + canvas.uiOffset.getY()),
//						BHLMath.toInt((showCost ? 0.5 : 1) * diameter), BHLMath.toInt((showCost ? 0.5 : 1) * diameter));
//			}
//
//			gc.dispose();
//		}
//	}
//
//	/**
//	 *
//	 * This method initializes all necessary parameters and images.
//	 *
//	 * @param parent is the parent element
//	 */
//
//	@Override
//	protected void init() {
//
//		canvas = new BHLCanvas(parent, SWT.DOUBLE_BUFFERED);
//
//		canvas.addPaintListener(e -> generateImage(e.gc));
//
//		canvas.addKeyListener(new KeyListener() {
//
//			@Override
//			public void keyPressed(KeyEvent e) {
//
//				int number = e.character - 48;
//				if (number <= costmaps.size() && number > 0 && number < 6) {
//
//					showCost = true;
//					costChoose = number;
//					canvas.redraw();
//					System.out
//							.println("HeatmapViewPart: Showing costmap door! (" + number + "/" + costmaps.size() + ")");
//
//				} else if (number == 0 || number > 5 && number <= 9) {
//
//					areamapChoose = number;
//					showCost = false;
//					canvas.redraw();
//
//					switch (number) {
//
//					case 0:
//						layer = Layer.ASTAR;
//						break;
//					case 6:
//						layer = Layer.BOTTOM;
//						break;
//					case 7:
//						layer = Layer.MIDDLE;
//						break;
//					case 8:
//						layer = Layer.TOP;
//						break;
//					case 9:
//						layer = Layer.CEILING;
//						break;
//					}
//
//					System.out.println("HeatmapViewPart: Showing Heatmap = " + layer.name());
//					part.setLabel("Heat Map (Layer " + layer.name() + ")");
//				}
//			}
//
//			@Override
//			public void keyReleased(KeyEvent e) {
//				// TODO Auto-generated method stub
//			}
//		});
//
//		canvas.redraw();
//	}
//
//	@Override
//	public String getURI() {
//		return null;
//	}
//}
