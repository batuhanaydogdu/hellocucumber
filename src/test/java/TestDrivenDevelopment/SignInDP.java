package TestDrivenDevelopment;

import org.testng.annotations.DataProvider;

public class SignInDP {
    @DataProvider(name = "SignInProvider")
    public Object [][] signInData(){
        Object [][] data= new Object[8][3];
        data [0][0] = "standard_user"; data [0][1] = "secret_sauce";    data[0][2]=true;
        data [1][0] = "locked_out_user"; data [1][1] = "secret_sauce";     data[1][2]=true;
        data [2][0] = "problem_user"; data [2][1] = "secret_sauce";    data[2][2]=true;
        data [3][0] = "performance_glitch_user"; data [3][1] = "secret_sauce";     data[3][2]=true;

        data [4][0] = "standarduser"; data [4][1] = "secret_sauce";    data[4][2]=false;
        data [5][0] = "standard_user"; data [5][1] = "secretsauce";     data[5][2]=false;
        data [6][0] = "problem_user"; data [6][1] = "secret_sauce_problem";    data[6][2]=false;
        data [7][0] = "problem_user_sauce"; data [7][1] = "secret_sauce";     data[7][2]=false;
        return data;
    }
}
