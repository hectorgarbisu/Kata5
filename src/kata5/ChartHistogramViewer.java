package kata5;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;

public class ChartHistogramViewer<T> implements HistogramViewer<T> {

    @Override
    public void show(Histogram<T> histogram) {
        JFrame frame = new JFrame("Histogram");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(createChartPanel(histogram));
        frame.setVisible(true);
    }
    
    private ChartPanel createChartPanel(Histogram<T> histogram){
        ChartPanel panel = new ChartPanel(createChart(histogram));
        return panel;
    }
    
    private JFreeChart createChart(Histogram<T> histogram){
        JFreeChart chart = ChartFactory.createBarChart("Histogram",
                "Categories",
                "Frequency",
                createDataSet(histogram));
        return chart;
    }

    private CategoryDataset createDataSet(Histogram<T> histogram) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
