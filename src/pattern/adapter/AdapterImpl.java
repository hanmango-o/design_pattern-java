package pattern.adapter;

public class AdapterImpl implements Adapter {

    @Override
    public Float twiceOf(Float f) {
        System.out.println("twoTime 함수 호출");
        return (float) Math.twoTime(f.doubleValue());
    }

    @Override
    public Float halfOf(Float f) {
        System.out.println("half 함수 호출");
        return (float) Math.half(f.doubleValue());
    }
}
