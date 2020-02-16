
/*
    Solving get total area of two rectangles.

    CONDITION :
    Rectangle1 (K, L)~(M, N)
    Rectangle2 (P, Q)~(R, S)
    with (lower-left corner, upper-right courner)

    K < M
    L < N
    P < R
    Q < S

    The function should return -1 if the area of the sum exceeds 2,147,483,647

    -
    SOLVING :
    The condition what is overlapped rectangles
    1. Sum of the widths of two rectangles > Range of the widths of two rectangles on the coordinate
    2. Sum of the heights of two rectangles > Range of the widths of two rectangles on the coordinate

 */
public class GetRectangleArea {
    public int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
        int areaOfRectangle1 = (M-K) * (N-L);
        int areaOfRectangle2 = (R-P) * (S-Q);
        int areaOfOverlappedRectangle = 0;

        int sumOfWidths = (M-K) + (R-P);
        int sumOfWidthsOnCoordinate = Integer.max(M, R) - Integer.min(K, P);

        int sumOfHeights = (N-L) + (S-Q);
        int sumOfHeightsOnCoordinate = Integer.max(N, S) - Integer.min(L, Q);

        if((sumOfWidths > sumOfWidthsOnCoordinate) && (sumOfHeights > sumOfHeightsOnCoordinate)) {
            areaOfOverlappedRectangle = (sumOfWidths-sumOfWidthsOnCoordinate) * (sumOfHeights-sumOfHeightsOnCoordinate);
        }

        long totalArea = (areaOfRectangle1 + areaOfRectangle2 - areaOfOverlappedRectangle);
        if(totalArea > Integer.MAX_VALUE) {
            return -1;
        }
        return (int) totalArea;
    }
}