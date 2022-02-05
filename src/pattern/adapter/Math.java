package pattern.adapter;

public class Math {
    // 두배 로직
    public static double twoTime(double num) {
        return num * 2;
    }

    // 절반 로직
    public static double half(double num) {
        return num / 2;
    }

    // 강화된 알고리즘
    public static Double doubled(Double d) {
        return d * 2;
    }
}
