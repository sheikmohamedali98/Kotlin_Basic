package FuctionExpresion

fun main(args:Array<String>){

    var obj = FunctionEx();
    obj.skill = "JAVA";
    obj.show()

    var obj1 = FunctionEx()
    obj1.skill = "SQL"
    obj1.show();

    var obj3 = obj.plusSk(obj1)
    obj3.show();

    var obj4 = obj3 plusSkill obj
    obj4.show()

    var obj5 = obj4 + obj1
    obj5.show()
}

fun FunctionEx.plusSk(obj1:FunctionEx):FunctionEx{
    var newFunctionEx = FunctionEx()
    newFunctionEx.skill = this.skill+" "+obj1.skill;
    return newFunctionEx
}
//infix Function
infix  fun FunctionEx.plusSkill(obj1:FunctionEx):FunctionEx{
    var newFunctionEx = FunctionEx()
    newFunctionEx.skill = this.skill+" "+obj1.skill;
    return newFunctionEx
}
//operator overloading

operator infix  fun FunctionEx.plus(obj1:FunctionEx):FunctionEx{
    var newFunctionEx = FunctionEx()
    newFunctionEx.skill = this.skill+" "+obj1.skill;
    return newFunctionEx
}