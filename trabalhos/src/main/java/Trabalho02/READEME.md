TRABALHO 02 - Controle de Estoque 
-
* @author:  Igor Jose Costa Gonçalves
* @matricula: 202065138A

---
** DEFININDO RELAÇÕES DE OBRIGATORIEDADE
 
Pessoa
- nome  (ob)

Cliente
- cpf   (op)

Fornecedor
- cnpj  (ob)

Venda
- dataVenda  (ob)
- cliente    (ob)
- produto    (ob)
- qtdeVendida(ob)


Transacao
- dataTransacao (op)
- qtde          (ob)

Compra
- dataCompra (op)
- fornecedor (ob)
- qtdeCompra (ob)
- precoUnit  (ob)

Produto
- nome          (ob)
- qtdeEstoque   (op)
- precoUnit     (ob)
- estoqueMinimo (ob)
- estoqueMaximo (ob)