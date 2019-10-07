package concot

class CategoriaController {

    def index() {
        [categoriaList: Categoria.list(params),
         categoriaCount: Categoria.count()]
    }

    def show(Long id) {
        [categoria: Categoria.findById(id)]
    }
}
