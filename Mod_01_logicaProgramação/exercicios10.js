colaboradores = ['Rhoger', 'Cléverson', 'Gleysberto', 'Nádio', 'Rosiméri', 'Regislane', 'Agripino', 'Wellison']

idades = [69, 66, 58, 61, 60, 64, 59, 55]

temposDeTrabalho = [31, 29, 30, 26, 25, 24, 26, 29]

function imprimir(texto) {
  console.log(texto)
}

function verificarColaborador(nome) {
  retorno = -1
  for (cont = 0; cont < colaboradores.length; cont++) {
    if (nome == colaboradores[cont]){
      retorno = cont
    }
  }
  return retorno
}

function verificarAposentadoria(nome) {
  id = verificarColaborador(nome)
  if (id != -1)  {
    if (idades[id] >= 65) {
      imprimir("Parabéns, já pode sair de férias eternas :)")
    } else if (temposDeTrabalho[id] >= 30) {
      imprimir("Parabéns, já pode sair de férias eternas :)")
    } else if (idades[id] >= 60 && temposDeTrabalho[id] >= 25) {
      imprimir("Parabéns, já pode sair de férias  eternas :)")
    } else {
      imprimir("Infelizmente para você, ainda falta um tempo :(")
    }
  } else {
    imprimir("Colaborador inválido :|")
  }
}
verificarAposentadoria('Nádio')

verificarAposentadoria('Rosiméri')    // true (regra 3)
verificarAposentadoria('Agripino')    // false (falta 1 ano de idade para regra 3)
verificarAposentadoria('Rhoger')      // true (todas)
verificarAposentadoria('Hudnélson')   // false (colaborador inexistente)
verificarAposentadoria('Gleysberto')  // true (regra 2)
verificarAposentadoria('Regislane')   // false (falta 1 ano de idade para regra 1 e 1 de trabalho para regra 3)
verificarAposentadoria('Cléverson')   // true (regras 1 e 3)
verificarAposentadoria('Nádio')       // true (regra 3)
verificarAposentadoria('Wellison')    // false (falta 1 ano de trabalho para regra 2)
verificarAposentadoria('Florisberto') // false (colaborador inexistente)