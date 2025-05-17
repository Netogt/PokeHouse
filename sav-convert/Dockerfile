# Stage 1: build com .NET SDK 9.0
FROM mcr.microsoft.com/dotnet/sdk:9.0 AS build
WORKDIR /src

# Copia o projeto e restaura dependências
COPY PokemonSaveAPI.csproj ./
RUN dotnet restore                 # usa o SDK 9.0, suporta net9.0 :contentReference[oaicite:1]{index=1}

# Copia todo o código e publica em Release
COPY . . 
RUN dotnet publish -c Release -o /app/publish

# Stage 2: runtime com ASP.NET Core Runtime 9.0
FROM mcr.microsoft.com/dotnet/aspnet:9.0 AS runtime
WORKDIR /app

COPY --from=build /app/publish .

ENV ASPNETCORE_URLS=http://+:8000
EXPOSE 8000

ENTRYPOINT ["dotnet", "PokemonSaveAPI.dll"]
