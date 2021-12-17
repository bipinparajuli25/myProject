package stepDefinitions;

import cucumber.api.java.en.When;
import implementations.dummyEmployeeImpl;

public class dummyEmployeeStepDef {
    dummyEmployeeImpl dummyEmployee = new dummyEmployeeImpl();

    @When("^make a get call to the dummy employee$")
    public void make_a_get_call_to_the_dummy_employee() throws Throwable {
                dummyEmployee.getCall();
    }



    @When("^make a post call to the dummy employee$")
    public void make_a_post_call_to_the_dummy_employee() throws Throwable {
       dummyEmployee.postcall();



    }




    @When("^make a put call to dummy employee \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void make_a_put_call_to_dummy_employee_(String name, String salary, String age) throws Throwable {
        dummyEmployee.putCallDummyEmployee(name,salary,age);

    }

    @When("^make a get call to the dummy employee by \"([^\"]*)\"$")
    public void make_a_get_call_to_the_dummy_employee_by(String id) throws Throwable {
        dummyEmployee.getCallByemployeeId(id);

    }

    @When("^make a delete call to dummy employee by \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void make_a_delete_call_to_dummy_employee_by_(String name, String salary, String age) throws Throwable {
           dummyEmployee.deleteEmployee(name, salary, age);

    }
    @When("^make a delete call by \"([^\"]*)\"$")
    public void make_a_delete_call_by(String id) throws Throwable {
        dummyEmployee.deleteEmployeeById(id);

    }


    }




