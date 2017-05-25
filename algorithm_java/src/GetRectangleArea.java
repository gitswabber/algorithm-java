
/*
    Solving get total area of two rectangles.

    CONDITION :

    Rectangle1 (K, L)~(M, N)
    Rectangle2 (P, Q)~(R, S)

    K < M
    L < N
    P < R
    Q < S

    -
    SOLVING :
    The condition what is overlapped rectangles
    1. Sum of the widths of two rectangles > Sum of the widths of two rectangls on the coordinate
    2. Sum of the heights of two rectangles > Sum of the widths of two rectangls on the coordinate

 */
public class GetRectangleArea {
    public int solution(int K, int L, int M, int N, int P, int Q, int R, int S) {
        int areaOfRectangle1 = (M-K) * (N-L);
        int areaOfRectangle2 = (Q-P) * (S-R);

        int sumOfWidths = (M-K) + (Q-P);
        int sumOfWidthsOnCoordinate = (K < P? K:P) + (M < R? M:R);
    }
}