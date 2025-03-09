package incubation.drykissyagni;

//YAGNI (You Ain't Gonna Need It)
//Definition: Don’t build features or code that you don’t currently need.
//Avoid premature optimization or over-engineering.
//Helps focus on immediate requirements rather than hypothetical future ones.
//
//When to Use?
//When you’re tempted to write extra code “just in case”.
//When adding unnecessary complexity that might never be used.
//Helps keep the codebase clean, efficient, and maintainable.
public class YAGNIExample {
    //❌ Bad Practice (Violates YAGNI)
    class ReportGenerator {
        public void generateReport(String format) {
            if (format.equals("PDF")) {
                // Generate PDF report
            } else if (format.equals("Excel")) {
                // Generate Excel report
            } else if (format.equals("CSV")) {
                // Generate CSV report
            } else if (format.equals("XML")) {
                // Generate XML report (not needed now)
            }
        }
    }

    //Good Practice (YAGNI Applied)
    class ReportGeneratorUpdated {
        public void generateReport(String format) {
            if (format.equals("PDF")) {
                // Generate PDF report
            } else if (format.equals("Excel")) {
                // Generate Excel report
            } else if (format.equals("CSV")) {
                // Generate CSV report
            }
        }
    }


}
