请求和路由进行匹配，用到predicate，它是决定了一个请求走哪一个路由。

Predicate来自于java8的接口。Predicate 接受一个输入参数，返回一个布尔值结果。
该接口包含多种默认方法来将Predicate组合成其他复杂的逻辑（比如：与，或，非）。
可以用于接口请求参数校验、判断新老数据是否有变化需要进行更新操作。add–与、or–或、negate–非。

Spring Cloud Gateway内置了许多Predict，参看predicate.png