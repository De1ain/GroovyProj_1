class Loops {
    static void main(String[] args) {
        def i=0;

        while(i<10){
            if(i%2){
                i++
                continue
            }
            if(i == 8 ){
                break
            }
            println "i: " + i
            i++
        }

        for(i=0 ; i<5 ; i++){
            println "i: " + i
        }

        for (j in 2..6) {
            println "j: " + j
        }

        def list = [10, 13, 15, 22]
        for (j in list) {
            println "list[]: " + j
        }

        def customers = [
                100: 'Tim',
                101: 'Bob',
                102: 'John'
        ]
        for(cutomer in customers){
            println "Customer: " + cutomer
        }
        customers.each {k, v -> println("${k}: ${v}")}


        list = [1, 4, 7, 9]
        list.eachWithIndex {entry, index -> {
            println "Entry: ${entry} at index: ${index}"
        }}

    }
}
