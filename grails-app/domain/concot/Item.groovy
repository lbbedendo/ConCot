package concot

class Item {
    String nome
    byte[] imagem

    static belongsTo = [categoria:Categoria]

    String toString() {
        this.nome
    }

    static constraints = {
        nome nullable: false, blank: false, maxSize: 128
        categoria nullable: false
        imagem nullable: true, maxSize: 65536
    }
}
