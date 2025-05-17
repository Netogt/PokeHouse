# Dockerfile.dev
FROM node:21
WORKDIR /app
COPY package*.json ./
RUN npm install
# Exponha a porta Angular e a porta de live-reload
EXPOSE 4200 49153
CMD ["npm", "start"]
