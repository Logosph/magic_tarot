from pydantic import BaseModel


class RegisterSchemaIn(BaseModel):
    name: str
    email: str
    password: str


class AuthSchemaIn(BaseModel):
    email: str
    password: str




