# 1 - Principais protocolos usados em comunicação realizada na web:
    Os principais protocolos são HTTP, HTTPS e TCP/IP
    O http é um protocolo de rede que permite a troca de informações entre cliente e servidor, esse protocolo é independente de plataforma, é como uma linguagem que permite que as diferentes tecnologias interajam entre si. Qualquer tecnologia que saiba "conversar" em http pode se comunicar com outra que também saiba. O https é como uma extensão mais segura do http, pois utiliza criptrografia na transferencia do dados. 
    O modelo conceitual OZY é utilizado para explicar as camadas do protocolo TCP/IP, mas na vida real utilizam-se apenas partes dessa camada. 
    1. Aplicação (http, https, dns) é onde ocorre a troca de dados, o navegador gera informações para encaminhar para a proxima camada. 
    2. Transporte (tcp, udp) é onde ocorre a troca de segmentos, o tcp divide em packs de bits para enviar para a próxima camada.
    3. Internet (ip,icmp) é onde ocorre a troca dos pacotes. Nessa camada é perguntado ao dns que busca o ip corresponde a url requisitada e carimba em cada pedaço o ip de origem e destino para encontrar o devido caminho pela rede.
    4. Rede (Ethernet, wi-fi), essa camada é o enlace, onde ocorre a troca de bits através de um novo empacotamento, como um envelope especial que possa ser enviado por cada meio físico disponível. Cuida dos pacotes adequados para serem enviados da forma correta. 
    5. Nesta etapa, o servidor recebe os pacotes e faz todo o caminho inverso de desempacotamento para devolver corretamente ao cliente o que foi silicitado. 
    
# 2 - Arquitetura cliente x servidor
    O modelo client-server funciona basicamente através de perguntas e respostas. O cliente envia requisições/perguntas para o servidor que as recebe e devolve suas respectivas respostas. Quando há muitas requisições, o servidor organiza uma lista de espera chamada de pool de espera, onde cada requisição forma uma lista para ser atendida uma de cada vez. 
    
    
# 3 - Papel do http na arquitetura web
    O http desempenha um papel fundamental na comunicação entre cliente e servidor, pois é através dele que o client envia as para o servidor, e o servidor por sua vez, devolve as informações solicitadas através do protocolo http. Com o http podemos integrar várias tecnologias como linguagens front-end e back-end, além da possibilidade da integração com banco de dados.  
    
    
# 4.a) 3 exemplos de métodos de requisição e suas características:
    Verbo GET: usado para obter dados, os dados são capturados pela url. 
    Verbo POST: envia dados através de formulários, não exibe os dados na url, é usado para cadastrar informações pessoais em cadastros e possibilita enviar um volume maior de informações.
    Verbo DELETE: remove dados, é usado para excluir itens de uma lista por exemplo. 
    
# 4.b) 3 exemplos de status de respostas e quando ocorrem:
    200: É um OK, é retornado para solicitações realizadas com sucesso.
    404: Not Found é retornado quando os recursos não são localizados pelo servidor.
    500: Internal server error é retornado quando há um erro no servidor, como algum erro no código que o servidor não consegue interpretar. 
    
# 5 - Estratégias para empurrar informações novas ao cliente como emial ou curtida:
    Podemo-se utilizar @Annotation para empurrar informações do servidor para o cliente. As anotações são metadados que podem ser usados em aplicações web identificando eventos e notificando o cliente, como emails e curtidas. 
