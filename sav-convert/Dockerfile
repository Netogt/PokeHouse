# Usar imagem base do .NET 9 SDK para compilação
FROM mcr.microsoft.com/dotnet/sdk:9.0 AS build
WORKDIR /app

# Copiar arquivos de projeto e restaurar dependências
COPY *.csproj ./
RUN dotnet restore

# Copiar o restante do código e compilar
COPY . ./
RUN dotnet publish -c Release -o out

# Usar imagem base do .NET 9 runtime para execução
FROM mcr.microsoft.com/dotnet/aspnet:9.0 AS runtime
WORKDIR /app
COPY --from=build /app/out ./

# Criar diretório para arquivos .sav
RUN mkdir /saves
VOLUME /saves

# Expor a porta 5148
EXPOSE 5148

# Definir variável de ambiente para a porta
ENV ASPNETCORE_URLS=http://+:5148

# Definir ponto de entrada
ENTRYPOINT ["dotnet", "PokemonSaveAPI.dll"]
