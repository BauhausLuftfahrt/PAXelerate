package net.bhl.cdt.model.observer;

import net.bhl.cdt.model.cabin.ui.CabinViewPart;

/**
 * TODO: Description
 */
public class AgentPosition extends Observer {

	int[][] newPosition;
	int[] submitPosition;
	CabinViewPart cabinViewPart;
	
	/**
	 * TODO: Description
	 */
	@Override
	public void update(int i) {

		// /**********Get CabinView and ConsoleView************/
		// IWorkbenchPage page =
		// PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		// cabinViewPart = (CabinViewPart)
		// page.findView("net.bhl.cdt.model.cabin.cabinview");
		// /***************************************************/
		//
		// newPosition = ((Agent) observedSubject)
		// .getCurrentAgentPosition();
		// submitPosition[0] = newPosition[i][0];
		// submitPosition[1] = newPosition[i][1];
		// cabinViewPart.submitPassengerCoordinates(0, submitPosition);

		// JFrame frame = TestAStar.frame;

		// System.out.println(((Agent) observedSubject).getAgentName() + ": "+
		// newPosition[i][0] + " " + newPosition[i][1]);

	}

}