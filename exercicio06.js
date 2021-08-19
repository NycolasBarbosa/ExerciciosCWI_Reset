peso = 180
altura = 1.80
calculoImc =(peso/(altura*altura))
imc = ""
grauObs ="" 
if (calculoImc<18.50){
  imc = "Magreza"
  grauObs = 0
}
else if (calculoImc<24.99){
  imc = "Normal"
  grauObs = 0
}
else if (calculoImc<29.99){
  imc = "Sobrepeso"
  grauObs = 1
}
else if (calculoImc<39.99){
  imc = "Obsidade"
  grauObs = 2
}
else{
  imc = "Obsidade grave"
  grauObs = 3
}

console.log("seu IMC é de: "+ calculoImc +" sua classificação é: "+imc+" e seu grau de obsidade é de: "+grauObs)
if (grauObs>0){
  console.log("Cuidado! Você está acima do peso recomendado pela OMS.")
}
if (grauObs == 3){
  console.log("É importante procurar um médico para avaliar sua saúde.")
}