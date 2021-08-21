  //ex01
vet = [01,25,33,18,44]
for(cont=0; cont<5; cont++){
console.log(vet[cont])
}

  //ex02
vet = [1, 2, 3, 5, 8, 13, 21, 23, 34, 55]
soma = 0
cont = 0
while(cont<vet.length){
  soma = vet[cont] + soma
  cont++
}
console.log(soma / vet.length)

  //ex03
nomesComuns = ["Miguel", "Laura", "Lucas", "Beatriz", "Guilherme", "Maria", "Gabriel", "Ana", "Arthur", "Júlia", 
"Enzo", "Alice", "Rafael", "Mariana", "João", "Larissa", "Gustavo", "Maria Eduarda", "Pedro", "Sofia", 
"Bernardo", "Isabela", "Matheus", "Helena", "Davi", "Camila", "Heitor", "Lara", "Henrique", "Valentina", 
"Bruno", "Letícia", "Samuel", "Luana", "Felipe", "Amanda", "Lorenzo", "Yasmin", "Benjamin", "Sophia", 
"Vinícius", "Rebeca", "Rodrigo", "Juliana", "Eduardo", "Bruna", "Diego", "Cecília", "Antônio", "Fernanda", 
"Leonardo", "Isadora", "Noah", "Lorena", "Nícolas", "Lívia", "Daniel", "Manuela", "Thiago", "Vitória",]
nome = "Daniel"
cond = ""
for (cont = 0; cont < nomesComuns.length; cont++){
 cond = nomesComuns[cont] == nome
 if(cond){
   break
 }
}
if(cond){
  console.log(nome + " É, nome comum :P")
}
else{
  console.log(nome+" Diferentão, hein?")
}