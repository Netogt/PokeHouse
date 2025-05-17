# Usa a imagem oficial do .NET SDK para buildar
FROM mcr.microsoft.com/dotnet/sdk:8.0 AS build

WORKDIR /src

# Copia e restaura pacotes
COPY ["PokemonSaveReader.csproj", "./"]

RUN dotnet restore

# Copia tudo e builda
COPY . .

RUN dotnet publish -c Release -o /app/publish

# Runtime leve
FROM mcr.microsoft.com/dotnet/aspnet:8.0

WORKDIR /app

COPY --from=build /app/publish .

ENTRYPOINT ["dotnet", "PokemonSaveReader.dll"]

ENV ASPNETCORE_URLS=http://+:8000

EXPOSE 8000