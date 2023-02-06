from django.contrib import admin
from .models import Director,Pelicula, Genre #importo los modelos creados

# Register your models here.

admin.site.register(Director)
admin.site.register(Pelicula)
admin.site.register(Genre)