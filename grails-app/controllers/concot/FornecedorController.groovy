package concot

class FornecedorController {

    def index() {
        [fornecedorList: Fornecedor.list(params),
         fornecedorCount: Fornecedor.count()]
    }

    def show(Long id) {
        [fornecedor: Fornecedor.findById(id)]
    }

    def comunicacao() {
        [fornecedores: Fornecedor.list(), mensagem: new EnvioEmail()]
    }
}
