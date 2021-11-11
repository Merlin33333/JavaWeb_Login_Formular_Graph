package ch.bbbaden.ila3_m133_m152_login.formular;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.BarChartModel;

@Named(value = "bean")
@SessionScoped
public class Bean implements Serializable{

    private final BarChartModel model;
    private int FormularOneYes = 0;
    private int FormularOneNo = 0;
    private int FormularTwoYes = 0;
    private int FormularTwoNo = 0;

    @Inject
    private FormularBean d;
//    FormularBean d = new FormularBean();

    public void test() {
        
 if (d.getEheFürAlle().equals("ja")) {
            FormularOneYes = FormularOneYes + 1;
        } else {
            FormularOneNo = FormularOneNo + 1;
        }
        if (this.d.getExistenz().equals("ja")) {
            FormularOneYes = FormularOneYes + 1;
        } else {
            FormularOneNo = FormularOneNo + 1;
        }
        if (this.d.getKakao().equals("ja")) {
            FormularOneYes = FormularOneYes + 1;
        } else {
            FormularOneNo = FormularOneNo + 1;
        }
        if (this.d.getKaffee().equals("ja")) {
            FormularOneYes = FormularOneYes + 1;
        } else {
            FormularOneNo = FormularOneNo + 1;
        }

        //Formular 2
        if (this.d.getInitiative99().equals("ja")) {
            FormularTwoYes = FormularTwoYes + 1;
        } else {
            FormularTwoNo = FormularTwoNo + 1;
        }
        if (this.d.getKreativität().equals("ja")) {
            FormularTwoYes = FormularTwoYes + 1;
        } else {
            FormularTwoNo = FormularTwoNo + 1;
        }

    }

    public Bean() {
       
          model = new BarChartModel();
       

        
    }

    public BarChartModel getModel() {
       this.test();
      
        ChartSeries yes = new ChartSeries();
        yes.setLabel("Ja");
        yes.set("Formular 1", FormularOneYes);
        yes.set("Formular 2", FormularTwoYes);
//        yes.set("2006", 44);
//        yes.set("2007", 150);
//        yes.set("2008", 25);
        ChartSeries No = new ChartSeries();
        No.setLabel("Nein");
        No.set("Formular 1", FormularOneNo);
        No.set("Formular 2", FormularTwoNo);
//        No.set("2006", 110);
//        No.set("2007", 135);
//        No.set("2008", 120);

        model.addSeries(yes);
        model.addSeries(No);
        model.setTitle("Bar Chart");
        model.setLegendPosition("ne");
        Axis xAxis = model.getAxis(AxisType.X);
        xAxis.setLabel("Stimmen");
        Axis yAxis = model.getAxis(AxisType.Y);
        yAxis.setLabel("Antworten");
        yAxis.setMin(0);
        yAxis.setMax(10);
        return model;
    }
}
