
function imprimir(texto){
console.log(texto)
}
imprimir("Lista de exercicios")
imprimir("---")

function mesmoNome(nomeFulano,nomeBeltrano){
  comparativo = nomeFulano == nomeBeltrano

  return comparativo
}
imprimir(mesmoNome("Nycolas","Marcele"))
imprimir("---")

function maiorDeIdade(idade){
  comparativo  =  idade  >=  18
  return comparativo
}
imprimir(maiorDeIdade(26))
imprimir("---")

function valorComJuros(valor){
juros  =  valor * 0.10
comparativo  =  valor  +  juros
return comparativo
}
imprimir(valorComJuros(10))
imprimir("---")

function mediaAritmetica(vet) {
  soma = 0
  for (cont = 0; cont < vet.length; cont++) {
    soma = vet[cont] + soma
  }
  return soma / vet.length
}
imprimir(mediaAritmetica([10,50,20,30,145]))
imprimir("---")

function margemBruta(receitaLiquidaVendas,custoProdutoVendido) {
  lucroBruto = receitaLiquidaVendas - custoProdutoVendido
  resultado = (lucroBruto / receitaLiquidaVendas)*100
    return resultado
}
imprimir(margemBruta(150, 100))

imprimir("---")
cwi = "CWI"
reset = "Reset"
imprimir(mesmoNome(cwi, cwi))   // true
imprimir(mesmoNome(cwi, reset)) // false

imprimir("---")

imprimir(maiorDeIdade(30)) // true
imprimir(maiorDeIdade(18)) // true
imprimir(maiorDeIdade(5))  // false

imprimir("---")

imprimir(valorComJuros(100))   // 110
imprimir(valorComJuros(984.5)) // 1082.95

imprimir("---")

imprimir(mediaAritmetica([1]))             // 1
imprimir(mediaAritmetica([1, 4, 10]))      // 5
imprimir(mediaAritmetica([1, 2, 3, 4, 5])) // 3

imprimir("---")

imprimir(margemBruta(1000000, 500000))      // 50
imprimir(margemBruta(528459.11, 632501.87)) // -19.68[...]