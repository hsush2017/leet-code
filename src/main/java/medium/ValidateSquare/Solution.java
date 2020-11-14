package medium.ValidateSquare;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        if ((p1[0] == p2[0] && p1[1] == p2[1]) || (p2[0] == p3[0] && p2[1] == p3[1]) || (p3[0] == p4[0] && p3[1] == p4[1])) {
            return false;
        }

        double[] c = center(p1, p2, p3, p4);
        if (dist(c, p1) != dist(c, p2) || dist(c, p2) != dist(c, p3) || dist(c, p3) != dist(c, p4)) {
            return false;
        }

        double[][] vectors = new double[4][];
        vectors[0] = new double[]{c[0] - p1[0], c[1] - p1[1]};
        vectors[1] = rotate(vectors[0]);
        vectors[2] = rotate(vectors[1]);
        vectors[3] = rotate(vectors[2]);

        List<double[]> points = new ArrayList<>();
        points.add(new double[]{c[0] + vectors[0][0], c[1] + vectors[0][1]});
        points.add(new double[]{c[0] + vectors[1][0], c[1] + vectors[1][1]});
        points.add(new double[]{c[0] + vectors[2][0], c[1] + vectors[2][1]});
        points.add(new double[]{c[0] + vectors[3][0], c[1] + vectors[3][1]});


        return contains(p1, points) && contains(p2, points) && contains(p3, points) && contains(p4, points);
    }

    private boolean contains(int[] a, List<double[]> points) {
        double[] p = new double[]{a[0] * 1D, a[1] * 1D};
        for (double[] point : points) {
            if (point[0] == p[0] && point[1] == p[1]) {
                return true;
            }
        }

        return false;
    }

    private double[] rotate(double[] v) {
        return new double[]{-1 * v[1], v[0]};
    }

    private double dist(double[] center, int[] p) {
        return (center[0] - p[0]) * (center[0] - p[0]) + (center[1] - p[1]) * (center[1] - p[1]);
    }

    private double[] center(int[] a, int[] b, int[] c, int[] d) {
        double x = a[0] + b[0] + c[0] + d[0];
        double y = a[1] + b[1] + c[1] + d[1];

        return new double[]{x / 4D, y / 4D};
    }
}
