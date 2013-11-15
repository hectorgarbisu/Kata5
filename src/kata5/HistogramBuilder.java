package kata5;

public class HistogramBuilder<T> {

    private Histogram<T> histogram;

    private T[] items;
    
    public HistogramBuilder(T[] items){
        this.items = items;
    }
    
    public Histogram<T> build(T[] items) {
        histogram = new Histogram<>();
        for (T item : items) {
            histogram.put(item, getFrequency(item) + 1);
        }
        return histogram;
    }
    public <A> Histogram<A> build(AttributeExtractor<T,A> extractor){
        Histogram<A> histogram = new Histogram<>();
        for (T item : items) {
            A attribute = extractor.extract(item);
            histogram.put(attribute, histogram.get(attribute)+1);
        }
        return histogram;
    }

    public Integer getFrequency(T item) {
        if (histogram.containsKey(item)) {
            return histogram.get(item);
        }
        return 0;
    }
    
    public Histogram getHistogram(){
        return histogram;
    }
}
