/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package geb.site

class Model {

    public final static Map<String, String> HIGHLIGHT_PAGES = [
            crossbrowser: "Cross Browser",
            content     : "jQuery-like API",
            pages       : "Page Objects",
            async       : "Asynchronous Pages",
            testing     : "Testing",
            integration : "Build Integration"
    ]

    static Map<String, Object> get(Manuals manuals, String page) {
        [
                manuals: manuals,
                pages  : [Highlights: HIGHLIGHT_PAGES],
                page   : page
        ]
    }
}
