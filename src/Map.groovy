class Map {
    static void main(String[] args) {

        def map = [
                "name"   : "Tim",
                "age"    : 34,
                "address": "123 Main St.",
                "list"   : [4, 7, 2]
        ];

        println "map['name']: " + map['name']
        println "map.get('age'): " + map.get('age')
        println "map['list']: " + map['list']
        println "map['list'][1]: " + map['list'][1]

        map.put('city', 'Holon');
        println map

        println "map.containsKey('city'): " + map.containsKey('city')
        println "map.size(): " + map.size()

        map.each { k, v -> println k + ":" + v }

        map.each{println "${it.key}: ${it.value}"}
    }
}
