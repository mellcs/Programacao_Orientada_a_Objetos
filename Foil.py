class Pessoa:
    def __init__(self, nome, pais, animais=[]):
        self.nome = nome
        self._pais = pais          
        self._animais = animais    

    def mostrar_fase(self):
        raise NotImplementedError("Este método deve ser implementado pela subclasse")


class Mell(Pessoa):  
    def __init__(self, nome, pais, animais=[]):
        super().__init__(nome, pais, animais)
        self._fases = []  
        self._preencher_fases()

    def _preencher_fases(self):
        self._fases = [
            ("1 - 7", "[27/12/2004 - Nascimento]", [
                "Mell nasce às 10 da manhã em Santa Maria.",
                f"Seus pais são {self._pais[0]} e {self._pais[1]}.",
                "Mell aprende a falar com 10 meses.",
                "Mell mora ao lado de sua avó paterna.",
                "Mell não gosta de toque físico com estranhos.",
                "Aos 5 anos, Mell adota Cristal.",
                "Mell ganha Moisés, o urso de pelúcia.",
                "Mell e sua família vão à igreja, e seus pais participam ativamente.",
                "Seu pai viaja bastante, então ela passa muito tempo com a sua mãe.",
                "Mell tem vários bichinhos ao longo dos anos: patos, pintinhos, hamsters, e Cristal.",
                "Mell conhece Maria na creche.",
                "Aos 7 anos, Mell se muda para Horizontina."
            ]),
            ("7 - 14", "[2011 - Infância e primeiros estudos]", [
                "Mell entra para uma nova escola e faz alguns amigos, mas brinca mais sozinha.",
                "Mell mora ao lado dos avós maternos, no interior da cidade, e gosta muito do lugar.",
                "A família de Mell entra para a igreja quadrangular de Horizontina.",
                "Mell não pode ler certas coisas, nem assistir certas coisas. Mell aprende a ficar sozinha, pois nem todos os seus amigos são aceitáveis.",
                "Mell começa a fazer inglês.",
                "Mell quer ser bióloga marinha.",
                "Mell começa a ler muito, livros e ficções digitais, e passa a usar muito a internet.",
                "Mell se muda para outra casa, com muitas árvores e um pátio grande. Mell gosta ainda mais daquele lugar.",
                "Seu pai continua viajando muito. É um pouco instável.",
                "Mell tem muitos gatos nessa época.",
                "Mell bota aparelho, e o tira depois de 6 meses.",
                "Mell começa a assistir filmes, e vai à locadora todos os finais de semana.",
                "Mell percebe que também gosta de meninas. Mell sabe que algo ruim vai acontecer se contar para seus pais. Mell não diz nada.",
                "Aos 14 anos, Mell precisa se mudar de volta para Santa Maria. É muito difícil."
            ]),
            ("15 - 18", "[2019 - Adolescência]", [
                "Mell volta para a primeira casa onde viveu. Há uma grande faxina e a casa fica limpa de novo.",
                "A família de Mell para de ir à igreja. A pressão diminui.",
                "A mãe de Mell mexe em seu celular e descobre seu segredo. A mãe de Mell ora por ela e é estranho.",
                "Mell se assume para seu pai. Seu pai não liga. Obrigada pai.",
                "Mell tem um pequeno surto e enfim consegue tratamento.",
                "A pandemia começa, e dura o primeiro e o segundo ano do ensino médio de Mell. Foram anos muito confortáveis.",
                "Mell passa muito tempo online, jogando, falando com pessoas de longe, escrevendo, e consumindo mídia. É nessa época que ela fica fluente em inglês.",
                "Mell começa a jogar RPG com gringos no discord. Ela joga com eles por um ano.",
                "Mell sente muita falta de seus amigos de Horizontina. Ela fala com duas delas hoje em dia.",
                "Mell volta para a escola presencial. É muito estressante. Mell faz vários amigos, mas não sai muito com eles. Mell ainda é amiga de Maria.",
                "Mell começa a trabalhar na RGE. Ela fica lá por 6 meses.",
                "Cristal morre.",
                "Mell tem um hamster chamado Chilton, que vive por dois anos de forma bem feliz e morre bem gordinho depois de explodir. Foi um problema glandular.",
                "Mell compra um celular com o dinheiro do emprego.",
                "Mell decide fazer algo na área de tecnologia pois em teoria isso dará dinheiro. Se ela tivesse escolhido livremente, teria sido algo na área de humanas ou da biologia.",
                "Mell entra na AMF.",
                "Sua avó paterna morre. Alguns meses depois, sua tia paterna morre."
            ]),
            ("18 - 20", "[2025 - Faculdade e vida adulta]", [
                "Mell é diagnosticada com autismo. Mell se sente vista.",
                "Mell foca tem tirar boas notas na faculdade. Mell também foca em organizar bem suas horas extracurriculares, e suas cadeiras eletivas.",
                "Mell ainda é amiga de Maria. Elas se falam esporadicamente pois ambas odeiam mandar mensagem.",
                "Mell e sua mãe ficam mais próximas, pois a igreja não fica no meio. Mell a obriga a assistir suas mídias favoritas, como Velozes e Furiosos, Entrevista com o Vampiro e Fronteiras do Universo. Sua mãe não entende tudo muito bem, mas ela assiste mesmo assim.",
                "Mell desiste do relacionamento com seu pai.",
                "Mell faz bons amigos na faculdade, e ela sai com eles. Essas coisas são relevantes pois Mell é muito solitária, e essas coisas são novidade pra ela. Mell tem muita consideração por seus amigos.",
                "Mell tenta sair de casa sozinha uma vez por mês. Ela geralmente vai ao shopping pois é um lugar fechado e controlado, mas já foi ao centro da cidade para seu aniversário. Ela já foi acompanhada para a Vila Belga, o Museu Gama d´Eça e Victor Bersani, na biblioteca pública, e tem outros lugares já planejados para visitar.",
                "Mell entra no JET.",
                "Mell fica bêbada pela primeira vez. É engraçado. Sua mãe discorda.",
                "Moisés, o urso, ainda vive, cheio de remendos."
            ])
        ]

    def mostrar_fase(self):
        for faixa, titulo, eventos in self._fases:
            print(f"{faixa}")
            print(titulo)
            for e in eventos:
                print(e)
            input("\nPressione Enter para continuar...\n")


if __name__ == "__main__":
    mell = Mell("Mell", ["Márcia", "Hamilton"], ["Cristal"])
    mell.mostrar_fase()
