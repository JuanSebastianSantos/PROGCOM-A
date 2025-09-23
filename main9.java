{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyMC3weVOylV+8FSyRyQ7BJL",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/JuanSebastianSantos/PROGCOM-A/blob/main/main9.java\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": null,
      "metadata": {
        "id": "EhY5RiSkTFlJ"
      },
      "outputs": [],
      "source": [
        "public class Main {\n",
        "    public static void main(String[] args) {\n",
        "        int[] temperaturas = {22, 25, 27, 29, 30, 33};\n",
        "\n",
        "        for (int temp : temperaturas) {\n",
        "            if (temp < 26) {\n",
        "                System.out.println(temp + \"°C ’ frio\");\n",
        "            } else if (temp <= 29) {\n",
        "                System.out.println(temp + \"°C ’ templado\");\n",
        "            } else {\n",
        "                System.out.println(temp + \"°C ’ caliente\");\n",
        "            }\n",
        "        }\n",
        "    }\n",
        "}"
      ]
    }
  ]
}