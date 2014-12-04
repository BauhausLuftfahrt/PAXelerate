
package net.bhl.cdt.model.astar;


import java.util.ArrayList;

/**
 * 
 * @author marc.engelmann
 *
 */
public class Node implements Comparable<Node> {
        private AreaMap map;
        private Node north;
        private Node northEast;
        private Node east;
        private Node southEast;
        private Node south;
        private Node southWest;
        private Node west;
        private Node northWest;
        private ArrayList<Node> neighborList;
        private boolean visited;
        private float distanceFromStart;
        private int costFromStart;
        private float heuristicDistanceFromGoal;
        private Node previousNode;
        private int x;
        private int y;
        public boolean isObstacle;
        public boolean isOccupiedByAgent;
        private boolean isStart;
        private boolean isGoal;
        private int cost;
        private double compareFactor;
        
     /**
     * 
     * @return
     */
    public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

		Node(int x, int y) {
                neighborList = new ArrayList<Node>();
                this.x = x;
                this.y = y;
                this.visited = false;
                this.distanceFromStart = Integer.MAX_VALUE;
                this.costFromStart = Integer.MAX_VALUE;
                this.compareFactor = Integer.MAX_VALUE;
                this.isObstacle = false;
                this.isStart = false;
                this.isGoal = false;
        }
       
        public double getCompareFactor() {
			return compareFactor;
		}

		public void setCompareFactor(double compareFactor) {
			this.compareFactor = compareFactor;
		}

		Node (int x, int y, boolean visited, int distanceFromStart, boolean isObstical, boolean isStart, boolean isGoal) {
                neighborList = new ArrayList<Node>();
                this.x = x;
                this.y = y;
                this.visited = visited;
                this.distanceFromStart = distanceFromStart;
                this.isObstacle = isObstical;
                this.isStart = isStart;
                this.isGoal = isGoal;
        }
       
        public Node getNorth() {
                return north;
        }

        public void setNorth(Node north) {
                //replace the old Node with the new one in the neighborList
                if (neighborList.contains(this.north))
                        neighborList.remove(this.north);
                neighborList.add(north);
               
                //set the new Node
                this.north = north;
        }

        public Node getNorthEast() {
                return northEast;
        }

        public void setNorthEast(Node northEast) {
                //replace the old Node with the new one in the neighborList
                if (neighborList.contains(this.northEast))
                        neighborList.remove(this.northEast);
                neighborList.add(northEast);
               
                //set the new Node
                this.northEast = northEast;
        }

        public Node getEast() {
                return east;
        }

        public void setEast(Node east) {
                //replace the old Node with the new one in the neighborList
                if (neighborList.contains(this.east))
                        neighborList.remove(this.east);
                neighborList.add(east);
               
                //set the new Node
                this.east = east;
        }

        public Node getSouthEast() {
                return southEast;
        }

        public void setSouthEast(Node southEast) {
                //replace the old Node with the new one in the neighborList
                if (neighborList.contains(this.southEast))
                        neighborList.remove(this.southEast);
                neighborList.add(southEast);
               
                //set the new Node
                this.southEast = southEast;
        }

        public Node getSouth() {
                return south;
        }

        public void setSouth(Node south) {
                //replace the old Node with the new one in the neighborList
                if (neighborList.contains(this.south))
                        neighborList.remove(this.south);
                neighborList.add(south);
               
                //set the new Node
                this.south = south;
        }

        public Node getSouthWest() {
                return southWest;
        }

        public void setSouthWest(Node southWest) {
                //replace the old Node with the new one in the neighborList
                if (neighborList.contains(this.southWest))
                        neighborList.remove(this.southWest);
                neighborList.add(southWest);
               
                //set the new Node
                this.southWest = southWest;
        }

        public Node getWest() {
                return west;
        }

        public void setWest(Node west) {
                //replace the old Node with the new one in the neighborList
                if (neighborList.contains(this.west))
                        neighborList.remove(this.west);
                neighborList.add(west);
               
                //set the new Node
                this.west = west;
        }

        public Node getNorthWest() {
                return northWest;
        }

        public void setNorthWest(Node northWest) {
                //replace the old Node with the new one in the neighborList
                if (neighborList.contains(this.northWest))
                        neighborList.remove(this.northWest);
                neighborList.add(northWest);
               
                //set the new Node
                this.northWest = northWest;
        }
       
        public ArrayList<Node> getNeighborList() {
                return neighborList;
        }

        public boolean isVisited() {
                return visited;
        }

        public void setVisited(boolean visited) {
                this.visited = visited;
        }

        public float getDistanceFromStart() {
                return distanceFromStart;
        }

        public void setDistanceFromStart(float f) {
                this.distanceFromStart = f;
        }

        public Node getPreviousNode() {
                return previousNode;
        }

        public void setPreviousNode(Node previousNode) {
                this.previousNode = previousNode;
        }
       
        public float getHeuristicDistanceFromGoal() {
                return heuristicDistanceFromGoal;
        }

        public void setHeuristicDistanceFromGoal(float heuristicDistanceFromGoal) {
                this.heuristicDistanceFromGoal = heuristicDistanceFromGoal;
        }

        public int getX() {
                return x;
        }

        public void setX(int x) {
                this.x = x;
        }

        public int getY() {
                return y;
        }

        public void setY(int y) {
                this.y = y;
        }
       
        public boolean isObstacle() {
                return isObstacle;
        }

        public void setObstacle(boolean isObstacle) {
                this.isObstacle = isObstacle;
        }
        
        public synchronized boolean isOccupiedByAgent() {
   			return isOccupiedByAgent;
   		}

   		public synchronized void setOccupiedByAgent(boolean isOccupiedByAgent) {
   			this.isOccupiedByAgent = isOccupiedByAgent;
   		}


        public boolean isStart() {
                return isStart;
        }

        public void setStart(boolean isStart) {
                this.isStart = isStart;
        }

        public boolean isGoal() {
                return isGoal;
        }

        public float getCostFromStart() {
			return costFromStart;
		}

		public void setCostFromStart(int costFromStart) {
			this.costFromStart = costFromStart;
		}
		
		public void setGoal(boolean isGoal) {
                this.isGoal = isGoal;
        }

        public boolean equals(Node node) {
                return (node.x == x) && (node.y == y);
        }
        
        /**EDITED BY MARC.ENGELMANN ON 01-12-2014*/
        /** modified this function in order to sort nodes by cost, not by distance!
         * Only if the cost is the same, sort it by the distance! 
         */ 
        
        /**
         * 
         */
        public int compareTo(Node otherNode) {
//        		/**better if: cheaper & closer or equally cheap but closer */ 
//                if(((costFromStart<otherNode.costFromStart)&&(distanceFromStart<otherNode.distanceFromStart))||((costFromStart==otherNode.costFromStart)&&(distanceFromStart<otherNode.distanceFromStart))) {
//                	return -1;
//                }
//                /**worse if: more expensive and further away or equally expensive but further away*/
//                else if(((costFromStart>otherNode.costFromStart)&&(distanceFromStart>otherNode.distanceFromStart))||((costFromStart==otherNode.costFromStart)&&(distanceFromStart>otherNode.distanceFromStart))) {
//                	return 1;
//                	} 
//                else { 
//                	return 0;
//                }
        	if(compareFactor < otherNode.compareFactor) {
        		return -1;
        	}else if(compareFactor > otherNode.compareFactor) {
        		return 1;	
        	} 
        	else {return 0;}
        }
}



