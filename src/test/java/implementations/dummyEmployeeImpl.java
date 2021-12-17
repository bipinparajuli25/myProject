package implementations;

import Utils.RestAssuredMethods;
import com.jayway.restassured.response.ValidatableResponse;
//import dao.MySqlConnection;
import dao.Mysqlconn;
import org.junit.Assert;

import java.sql.ResultSet;

public class dummyEmployeeImpl {
    ValidatableResponse response;
    RestAssuredMethods restAssuredMethods = new RestAssuredMethods();
    Mysqlconn mysqlconn = new Mysqlconn();


        public void getCall() throws Throwable {
            String host = "http://dummy.restapiexample.com";
            String endpoint = "/api/v1/employees";
            response = restAssuredMethods.getCall(host, endpoint);
            int statusCode = response.extract().statusCode();
            System.out.println("getCall status is:" + statusCode);
            Assert.assertEquals(429, statusCode);
    }




    public void postcall() throws Throwable {
        String host = "http://dummy.restapiexample.com";
        String endpoint = "/api/v1/create";
        String body = "{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}";
        response = restAssuredMethods.postCall(host, endpoint, body);
        int statusCode = response.extract().statusCode();
        System.out.println("postCall status code is: " + statusCode);
        Assert.assertEquals(200, statusCode);
        String responseoutput = response.extract().body().asString();
        System.out.println("responseOutput: " + responseoutput);

    }
      public void deleteEmployee(String name, String salary, String age) throws Throwable {
           String host = "http://dummy.restapiexample.com";
           String endpoint = "/api/v1/delete/2";
           String body = "{\"name\":\""+name+"\",\"salary\":\""+salary+"\",\"age\":\""+age+"\"}";
           System.out.println("input body is:" + body);
           response = restAssuredMethods.deleteCall(host, endpoint, body);
           int statusCode = response.extract().statusCode();
           System.out.println("delete call status is: " + statusCode);
           Assert.assertEquals(200, statusCode);
           String responseOutput = response.extract().body().asString();
           System.out.println("responseOutput = " + responseOutput);




      }

           public void putCallDummyEmployee(String name, String salary, String age) throws Throwable {
            Thread.sleep(3000);
              String host = "http://dummy.restapiexample.com";
              String endpoint = "/api/v1/update/21";
              String body = "{\"name\":\""+name+"\",\"salary\":\""+salary+"\",\"age\":\""+age+"\"}";
              System.out.println("input body is: "+ body);
              response = restAssuredMethods.putCall(host, endpoint, body);
              int statusCode = response.extract().statusCode();
              System.out.println("putcall status is: " + statusCode);
              Assert.assertEquals(200, statusCode);
              String responseOutput = response.extract().body().asString();
              System.out.println("status output is " + responseOutput);
           }


    public void getCallByemployeeId(String id) throws Throwable {
            Thread.sleep(5000);
            String host ="http://dummy.restapiexample.com";
            String endpoint = "/api/v1/employee/"+id;
            response = restAssuredMethods.getCall(host, endpoint);
            int statusCode = response.extract().statusCode();
            System.out.println("get call is :" + statusCode);
           // Assert.assertEquals(200, statusCode);
            String resopnseOutput = response.extract().body().asString();
            System.out.println("response for employee id"+ id +" : " + resopnseOutput);

           // validate the database result by employeeid
        String getbyId ="select * from bipin.employee where idemployee = "+id+";";
        ResultSet resultSet  = mysqlconn.mySqlConn(getbyId);
        while (resultSet.next()){
            int dbid = resultSet.getInt("idemployee");
            String name = resultSet.getString("employee_name");
            System.out.println("db employee name: " + name);
            String salary = resultSet.getString("employee_salary");
            System.out.println("employee salary: " + salary);
            String age = resultSet.getString("employee_age");
            System.out.println("employee age: " + age);
            Assert.assertEquals(dbid, response.extract().body().jsonPath().getInt("data.id"));
            System.out.println("validate employee id aginst database success");
            Assert.assertEquals(name, response.extract().body().jsonPath().getString("data.employee_name"));
            Assert.assertEquals(salary, String.valueOf(response.extract().body().jsonPath().getInt("data.employee_salary")));
            Assert.assertEquals(age,  String.valueOf(response.extract().body().jsonPath().getInt("data.employee_age")));


        }





    }




    public void deleteEmployeeById(String id) throws Throwable {
            String host = "http://dummy.restapiexample.com";
            String endpoint = "/api/v1/delete/" + id;
            String body = "";
           response = restAssuredMethods.deleteCall(host, endpoint, body);
           System.out.println(response.extract().body().asString());




    }


    public void getCallByActor(String id) throws Throwable {
            String host = "";
            String endpoint = "" + id;
            response = restAssuredMethods.getCall(host, endpoint);




    }
}



