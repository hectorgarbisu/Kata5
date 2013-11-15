package kata5;

public class Kata5 {

    public static void main(String[] args) {
        MailLoader loader = new MockMailLoader();
        HistogramBuilder<Mail> builder = new HistogramBuilder<>(loader.load());
        ConsoleHistogramViewer<String> viewer = new ConsoleHistogramViewer<>();
        viewer.show(builder.build(new AttributeExtractor<Mail, String>() {
            @Override
            public String extract(Mail entity) {
                return entity.getDomain();
            }
        }));
    }
}
