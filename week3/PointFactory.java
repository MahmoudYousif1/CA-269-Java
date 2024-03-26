enum Quadrant {
    Q1, Q2, Q3, Q4;
}

interface GridQuadrant {
    Quadrant getQuadrant();
}

interface CompareQuadrant {
    boolean isInSameQuadrant(Point other);
}

interface PointMaker {
    Point makePoint(double x, double y);

    int countPointsCreated();
}

    class Point implements GridQuadrant, CompareQuadrant {
        private double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public Quadrant getQuadrant() {
            if (x > 0 && y > 0)
                return Quadrant.Q1;
            if (x < 0 && y > 0)
                return Quadrant.Q2;
            if (x < 0 && y < 0)
                return Quadrant.Q3;
            if (x > 0 && y < 0)
                return Quadrant.Q4;
            return null;
        }

        public boolean isInSameQuadrant(Point other) {
            return this.getQuadrant() == other.getQuadrant();
        }
    }

    public class PointFactory implements PointMaker {
        private static int pointsCreated;
        
        public Point makePoint(double x, double y) {
            pointsCreated++;
            return new Point(x, y);
        }

        public int countPointsCreated() {
            return pointsCreated;
        }
        
    }
