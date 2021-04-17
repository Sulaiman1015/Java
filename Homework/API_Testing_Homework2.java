Homework2
/*
Q1:
Given accept type is json
And path param id is 20
When user sends a get request to "/api/spartans/{id}"
Then status code is 200
And content-type is "application/json;charset=UTF-8"
And response header contains Date
And Transfer-Encoding is chunked
And response payload values match the following:
id is 20,
name is "Lothario",
gender is "Male",
phone is 7551551687
*/

public class homwork2(){
    @BeforeClass
    public void beforeclass(){
        baseURI = "http://3.80.189.73:8000";
    }

    @Test
    public void Q1(){
        Response response = given().accept(ContentType.JSON)
                 .and().pathParam("id",20)
                 .when().get("/api/spartans/{id}");

        assertEquals(response.statusCode(),200);
        assertEquals(response.getHeader("Content-Type"),"application/json;charset=UTF-8");
        assertTrue(response.headers().toString().contains("Date"));
        assertEquals(response.getHeader("Transfer-Encoding"),"chunked");
        
        int id =  response.path("id");
        String name = response.path("name");
        String gender = response.path("gender");
        long phone = response.path("phone");

        assertEquals(id,20);
        assertEquals(name,"Lothario");
        assertEquals(gender,"Male");
        assertEquals(phone, 7551551687L);


    }

/*
Q2:
Given accept type is json
And query param gender = Female
And queary param nameContains = r
When user sends a get request to "/api/spartans/search"
Then status code is 200
And content-type is "application/json;charset=UTF-8"
And all genders are Female
And all names contains r
And size is 20
And totalPages is 1
And sorted is false
*/
    @Test
    public void Q2(){
        Response response = given().accept(ContentType.JSON)
                .and().queryParam("gender","Female")
                .and().queryParam("nameContains","r")
                .when().get("/api/spartans/search");
        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json;charset=UTF-8");

        List<String> genders = response.path("content.gender");
        for (String gender : genders) {
            assertEquals(gender,"Female");

        }

        List<String> names = response.path("content.name");
        for (String name : names) {
            assertTrue(name.toLowerCase().contains("r"));

        }

        int size = response.path("size");
        assertEquals(size,20);

        int totalPages = response.path("totalPages");
        assertEquals(totalPages,1);

        assertFalse(response.path("sort.sorted"));

    }

}