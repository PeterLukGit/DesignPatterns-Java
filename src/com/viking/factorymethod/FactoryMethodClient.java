package com.viking.factorymethod;
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

import com.viking.factorymethod.AbstractCarFactory;
import com.viking.factorymethod.BenzCarFactory;
import com.viking.factorymethod.ICar;

public class FactoryMethodClient {

    public static void main(String[] args){
        AbstractCarFactory carFactory = new BenzCarFactory() ;
        ICar car = carFactory.createCar() ;
        car.start();
        car.stop();
    }
}
