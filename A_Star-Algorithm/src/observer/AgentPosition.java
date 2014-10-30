package observer;
import model.TestAStar;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import model.Agent;
import model.TestAStar;

public class AgentPosition extends Observer {

	int[][] newPosition;
	
	@Override
	public void update(int i) {
		 newPosition = ((Agent) observedSubject)
				.getCurrentAgentPosition();
		 
		JFrame frame = TestAStar.frame;

		System.out.println(((Agent) observedSubject).getAgentName() + ": "
				+ newPosition[i][0] + " " + newPosition[i][1]);

	}

}