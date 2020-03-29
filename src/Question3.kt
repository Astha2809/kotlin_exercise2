/*Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there
 specific details like rateofinterest etc,print details of every bank.*/

open class Banks {
    open fun getDetails() {
        println("DEtails of bank")

    }

}

class SBI : Banks() {
    override fun getDetails() {
        println("Details of SBI")

    }
}

class BOI : Banks() {
    override fun getDetails() {
        println("Details of BOI")
    }
}

class ICICI : Banks() {
    override fun getDetails() {
        println("DEtails of ICICI")
    }
}

fun main(args: Array<String>) {
    var banks = Banks()
    var sbi = SBI()
    var boi = BOI()
    var icici = ICICI()
    banks.getDetails()
    sbi.getDetails()
    boi.getDetails()
    icici.getDetails()

}



