FROM python:3.10
RUN mkdir /app
WORKDIR /app

COPY requirements.txt .

RUN apt-get update
RUN apt-get install -y wkhtmltopdf

RUN pip install -vvv -r requirements.txt