# Instalar Dependência Local

* Baixe o arquivo Projeto1-0.0.1-SNAPSHOT.jar para a sua área de trabalho.
* Abra o Eclipse
* Clique com o botão direito em cima do seu projeto
* Escolha a opção *Run As* -> *Maven Build...*
* Edite o comando abaixo substituindo o **SEU-USUARIO-AQUI** pelo seu usuário do **Windows**.
* Uma nova janela será aberta (*Edit Configuration and Launch*).
* Cole o comando abaixo no Campo **Goals**
* Clique em *Run*

No caso de sucesso, será exiba a mensagem abaixo no console:

![image](https://github.com/javajdk2023/j05032024/assets/130251409/f0bef8b2-0d9e-47ad-9321-53c4b936549d)

Comando de *install*:

```
install:install-file -Dfile=C:\Users\SEU-USUARIO-AQUI\Desktop\Projeto1-0.0.1-SNAPSHOT.jar -DgroupId=br.com.fuctura.projeto -DartifactId=cepService -Dversion=0.0.1 -Dpackaging=jar
```

# Adicicionar Dependência no Projeto

Abra o arquivo POM.xml e adicione a dependência abaixo:

```
<dependency>
  <groupId>br.com.fuctura.projeto</groupId>
  <artifactId>cepService</artifactId>
  <version>0.0.1</version>
</dependency>
```

Verifique se a aba *Maven Dependencies* foi atualizada com a sua nova dependência:

![image](https://github.com/javajdk2023/j05032024/assets/130251409/fa233f79-5a71-4b8f-b41c-25ce250365b6)

