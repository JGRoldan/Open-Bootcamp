# Generated by Django 4.1.6 on 2023-02-06 11:56

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('catalog', '0001_initial'),
    ]

    operations = [
        migrations.CreateModel(
            name='Genre',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('genre', models.CharField(help_text='Indica el genero de la pelicula', max_length=15, verbose_name='Genereo')),
            ],
        ),
        migrations.RemoveField(
            model_name='pelicula',
            name='director',
        ),
        migrations.RemoveField(
            model_name='pelicula',
            name='genre',
        ),
        migrations.AddField(
            model_name='pelicula',
            name='genre',
            field=models.ManyToManyField(to='catalog.genre'),
        ),
    ]
