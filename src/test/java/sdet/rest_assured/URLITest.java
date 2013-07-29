package sdet.rest_assured;
/*
* Copyright 2011 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import org.junit.Test;

import com.jayway.restassured.RestAssured;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import sdet.rest_assured.support.AbstractRestAssuredTest;

public class URLITest extends AbstractRestAssuredTest {

	@Test
    public void specifyingFullyQualifiedPathOverridesDefaultValues() throws Exception {
        RestAssured.basePath = "/something";
        RestAssured.baseURI = "http://www.google.com";
        RestAssured.port = 80;
        try {
            expect().body("store.book[0..2].size()", equalTo(3)).when().get("http://localhost:8080/jsonStore");
        } finally {
            RestAssured.reset();
        }
    }
}
