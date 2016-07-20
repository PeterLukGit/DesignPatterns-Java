package com.viking.abstractfacotry;

import com.viking.util.Log;

/*  Copyright 2016 - Viking Den vikingden7@gmail.com
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*   http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/
public class AudiSportCar extends SportCar {

    @Override
    public void start() {
        Log.info("abstract-factory" ,"Audio sport car is start...");
    }

    @Override
    public void stop() {
        Log.info("abstract-factory" ,"Audi sport car is stop...");
    }
}