Homework-1

/*
Q1:
- Given accept type is Json
- Path param value- US
- When users sends request to /countries
- Then status code is 200
- And Content - Type is Json
- And country_id is US
- And Country_name is United States of America
- And Region_id is
*/

public class homwork1(){
    @BeforeClass
    public void beforeclass(){
        baseURI = "http://54.158.59.123:1000/ords/hr";
    }

    /*
Q1:
- Given accept type is Json
- Path param value- US
- When users sends request to /countries
- Then status code is 200
- And Content - Type is Json
- And country_id is US
- And Country_name is United States of America
- And Region_id is
*/


    @Test

        public void Q2(){

            Response response = given().accept(ContentType.JSON)
                    .and().queryParam("q", "{\"country_id\":\"US\"}")
                    .when().get("/countries");

            assertEquals(response.statusCode(),200);
            assertEquals(response.contentType(),"application/json");
            assertTrue(response.body().asString().contains("United States of America"));
            assertTrue(response.body().asString().contains("US"));

            List<Integer> regionIDs = response.path("items.region_id");

            for (int regionID : regionIDs) {
                System.out.println(regionID);
                assertEquals(regionID,2);
            }
        }



/*
Q2:
- Given accept type is Json
- Query param value - q={"department_id":80}
- When users sends request to /employees
- Then status code is 200
- And Content - Type is Json
- And all job_ids start with 'SA'
- And all department_ids are 80
- Count is 25
*/

@Test
    public void Q2(){

        Response response = given().accept(ContentType.JSON)
                .and().queryParam("q", "{\"department_id\":80}")
                .when().get("/employees");

        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json");

        List<String> jobIDs = response.path("items.job_id");
        for (String jobID : jobIDs) {
            System.out.println("jobID = " + jobID);
            assertTrue(jobID.startsWith("SA"));

        }
        List<Integer> depIDs = response.path("items.department_id");
        for (Integer depID : depIDs) {
            System.out.println("depID = " + depID);
            //assertEquals(depID,80);
        }
        int count = response.path("count");
        System.out.println("count = " + count);


    }

/*
Q3:
- Given accept type is Json
- Query param value q= region_id 3
- When users sends request to /countries
- Then status code is 200
- And all regions_id is 3
- And count is 6
- And hasMore is false
- And Country_name are;
Australia,China,India,Japan,Malaysia,Singapore
*/

@Test
    public void Q3(){

        Response response = given().accept(ContentType.JSON)
                .and().queryParam("q", "{\"region_id\":3}")
                .when().get("/countries");

        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json");
        System.out.println("hasMore is " + response.path("hasMore").toString());

        List<Integer> regionIDs = response.path("items.region_id");
        for (int regionID : regionIDs) {
            System.out.println("regionID = "+regionID);
            assertEquals(regionID,3);
        }

        int count = response.path("count");
        System.out.println("count = " + count);

        List<String> countryNames = response.path("items.country_name");
        
        System.out.println(countryNames);

    }




