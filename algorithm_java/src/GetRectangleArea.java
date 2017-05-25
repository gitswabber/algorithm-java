public class GetRectangleArea {
    public int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
        CustomRectangle rectangle1 = new CustomRectangle(K, L, M , L);
        CustomRectangle rectangle2 = new CustomRectangle(R, Q, R, S);

        return getOvelapedRectangle(rectangle1, rectangle2).getArea();
    }

    private CustomRectangle getOvelapedRectangle(CustomRectangle rectangle1, CustomRectangle rectangle2) {
        if(isOverlaped(rectangle1, rectangle2)) {
            // todo ...
        }
        return null;
    }

    private boolean isOverlaped(CustomRectangle rectangle1, CustomRectangle rectangle2) {
        // check if position of (rectangle1.x1, retangle1.y1) is in retangle2's area
        if( (rectangle2.getX1() < rectangle1.getX1() &&  rectangle1.getX1() < rectangle2.getX2())
                && (rectangle2.getY1() < rectangle1.getY1() && rectangle1.getY1() < rectangle2.getY2()) ) {
            return true;
        }
        // check if position of (rectangle1.x2, retangle1.y1) is in retangle2's area
        if( (rectangle2.getX1() < rectangle1.getX2() &&  rectangle1.getX2() < rectangle2.getX2())
                && (rectangle2.getY1() < rectangle1.getY1() && rectangle1.getY1() < rectangle2.getY2()) ) {
            return true;
        }
        // check if position of (rectangle1.x1, retangle1.y2) is in retangle2's area
        if( (rectangle2.getX1() < rectangle1.getX1() &&  rectangle1.getX1() < rectangle2.getX2())
                && (rectangle2.getY1() < rectangle1.getY2() && rectangle1.getY2() < rectangle2.getY2()) ) {
            return true;
        }
        // check if position of (rectangle1.x2, retangle1.y2) is in retangle2's area
        if( (rectangle2.getX1() < rectangle1.getX2() &&  rectangle1.getX2() < rectangle2.getX2())
                && (rectangle2.getY1() < rectangle1.getY2() && rectangle1.getY2() < rectangle2.getY2()) ) {
            return true;
        }

        return false;
    }

    class CustomRectangle {
        private int x1, y1, x2, y2;
        private int width;
        private int height;
        private int area;

        public CustomRectangle(int x1, int y1, int x2, int y2) {
            this.width = x2-x1;
            this.height = y2-y1;
            this.area = this.width * this.height;
        }

        public int getX1() {
            return x1;
        }

        public void setX1(int x1) {
            this.x1 = x1;
        }

        public int getY1() {
            return y1;
        }

        public void setY1(int y1) {
            this.y1 = y1;
        }

        public int getX2() {
            return x2;
        }

        public void setX2(int x2) {
            this.x2 = x2;
        }

        public int getY2() {
            return y2;
        }

        public void setY2(int y2) {
            this.y2 = y2;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getArea() {
            return area;
        }

        public void setArea(int area) {
            this.area = area;
        }
    }
}