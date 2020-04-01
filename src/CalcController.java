import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class CalcController implements Serializable {

    private double value;
    private Model model;

    public CalcController() {

        model=new Model();
    }

    public double getValue() {

        return value;
    }

    public void setValue(double value) {
        this.value = value;

    }

    public void calculate()
    {model.calculate(value);}

}
