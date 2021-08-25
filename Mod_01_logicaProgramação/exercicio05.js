//exr1
nomeFulano = "nycolas"
nomeBeltrano = "marcele"
mesmoNome = nomeFulano == nomeBeltrano
console.log(mesmoNome)

//exr2
idade = 26
maiorIdade = idade >= 18
console.log(maiorIdade)

//exr3
valor = 0
juros = valor*0.10
valorComJuros = valor + juros
console.log(valorComJuros)

//exr4
item1 = 10
item2 = 50
item3 = 20
item4 = 30
item5 = 145
media = (item1 + item2 + item3 + item4 + item5)/5
console.log(media)

//exr5
receitaLiquidaVendas = 150
custoProdutoVendido = 100
lucroBruto = receitaLiquidaVendas - custoProdutoVendido
margemBruta = (lucroBruto/receitaLiquidaVendas)*100
console.log("A margem de Lucro bruta é: "+margemBruta+"%")

//exr6
saldoInicial = 1000
calca = 99.90
salario = 2500
doacao = 0.10
valorArCond = 4
valorDivida = 2
saldo = saldoInicial - calca
saldo = saldo + salario
saldo = saldo - doacao
saldo = saldo - ( saldo/valorArCond )
saldo = saldo/valorDivida
console.log("Seu saldo é: R$"+saldo)