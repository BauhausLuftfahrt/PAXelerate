



import java.util.ArrayList;
import java.util.Collections;

public class AStar {
        private AreaMap map; //equals field in the matlab program
        private AStarHeuristic heuristic;
        //private int startX;
        //private int startY;
        //private int goalX;
        //private int goalY;
        /**
         * closedList The list of Nodes not searched yet, sorted by their distance to the goal as guessed by our heuristic.
         */
        private ArrayList<Node> closedList;
        private SortedNodeList openList;
        private Path shortestPath;
        Logger log = new Logger();

        AStar(AreaMap map, AStarHeuristic heuristic) {
                this.map = map;
                this.heuristic = heuristic;

                closedList = new ArrayList<Node>();
                openList = new SortedNodeList();
        }

        public Path calcShortestPath(int startX, int startY, int goalX, int goalY) {
                //this.startX = startX;
                //this.startY = startY;
                //this.goalX = goalX;
                //this.goalY = goalY;

                //mark start and goal node
                map.setStartLocation(startX, startY);
                map.setGoalLocation(goalX, goalY);

                //Check if the goal node is blocked (if it is, it is impossible to find a path there)
                if (map.getNode(goalX, goalY).isObstacle) {
                        return null;
                }

                map.getStartNode().setDistanceFromStart(0);
                closedList.clear();
                openList.clear();
                openList.add(map.getStartNode());

                //while we haven't reached the goal yet
                while(openList.size() != 0) {

                        //get the first Node from non-searched Node list, sorted by lowest distance from our goal as guessed by our heuristic
                        Node current = openList.getFirst();

                        // check if our current Node location is the goal Node. If it is, we are done.
                        if(current.getX() == map.getGoalLocationX() && current.getY() == map.getGoalLocationY()) {
                                return reconstructPath(current);
                        }

                        //move current Node to the closed (already searched) list
                        openList.remove(current);
                        closedList.add(current);

                        //go through all the current Nodes neighbors and calculate if one should be our next step
                        for(Node neighbor : current.getNeighborList()) {
                                boolean neighborIsBetter;

                                //if we have already searched this Node, don't bother and continue to the next one
                                if (closedList.contains(neighbor))
                                        continue;

                                //also just continue if the neighbor is an obstacle
                                if (!neighbor.isObstacle) {

                                        // calculate how long the path is if we choose this neighbor as the next step in the path
                                        float neighborDistanceFromStart = (current.getDistanceFromStart() + map.getDistanceBetween(current, neighbor));

                                        //add neighbor to the open list if it is not there
                                        if(!openList.contains(neighbor)) {
                                                openList.add(neighbor);
                                                neighborIsBetter = true;
                                                //if neighbor is closer to start it could also be better
                                        } else if(neighborDistanceFromStart < current.getDistanceFromStart()) {
                                                neighborIsBetter = true;
                                        } else {
                                                neighborIsBetter = false;
                                        }
                                        // set neighbors parameters if it is better
                                        if (neighborIsBetter) {
                                                neighbor.setPreviousNode(current);
                                                neighbor.setDistanceFromStart(neighborDistanceFromStart);
                                                neighbor.setHeuristicDistanceFromGoal(heuristic.getEstimatedDistanceToGoal(neighbor.getX(), neighbor.getY(), map.getGoalLocationX(), map.getGoalLocationY()));
                                        }
                                }

                        }

                }
                return null;
        }

       
       
        public void printPath() {
                Node node;
                for(int x=0; x<map.getMapWidth(); x++) {

                        if (x==0) {
                                for (int i=0; i<=map.getMapWidth(); i++)
                                        System.out.print("-");
                                System.out.println();  
                        }
                        System.out.print("|");

                        for(int y=0; y<map.getMapHeight(); y++) {
                                node = map.getNode(x, y);
                                if (node.isObstacle) {
                                        System.out.print("X");
                                } else if (node.isStart) {
                                        System.out.print("s");
                                } else if (node.isGoal) {
                                        System.out.print("g");
                                } else if (getShortestPath().contains(node.getX(), node.getY())) {
                                        System.out.print("¤");
                                } else {
                                        System.out.print(" ");
                                }
                                if (y==map.getMapHeight())
                                        System.out.print("_");
                        }

                        System.out.print("|");
                        System.out.println();
                }
                for (int i=0; i<=map.getMapWidth(); i++)
                        System.out.print("-");
        }

        private Path reconstructPath(Node node) {
                Path path = new Path();
                while(!(node.getPreviousNode() == null)) {
                        path.prependWayPoint(node);
                        node = node.getPreviousNode();
                }
                this.setShortestPath(path);
                return path;
        }

        public Path getShortestPath() {
			return shortestPath;
		}

		public void setShortestPath(Path shortestPath) {
			this.shortestPath = shortestPath;
		}

		private class SortedNodeList {

                private ArrayList<Node> list = new ArrayList<Node>();

                public Node getFirst() {
                        return list.get(0);
                }

                public void clear() {
                        list.clear();
                }

                public void add(Node node) {
                        list.add(node);
                        Collections.sort(list);
                }

                public void remove(Node n) {
                        list.remove(n);
                }

                public int size() {
                        return list.size();
                }

                public boolean contains(Node n) {
                        return list.contains(n);
                }
        }

}
