import SwiftUI

struct Text_widget_horz: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("StatType").font(.system(size: 10)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
      HStack(alignment: .center, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            VStack(alignment: .leading, spacing: 0) {
              Text("Since").font(.system(size: 10)).padding(.leading, 8.0).padding(.trailing, 0.0)
              Text("Deep Sleep").font(.system(size: 10)).foregroundColor(Color(red: 0.1803921568627451, green: 0.8, blue: 0.44313725490196076, opacity: 1)).padding(.leading, 8.0).padding(.trailing, 0.0)
              Text("Screen on").font(.system(size: 10)).foregroundColor(Color(red: 0.9450980392156862, green: 0.7686274509803922, blue: 0.058823529411764705, opacity: 1)).padding(.leading, 8.0).padding(.trailing, 0.0)
              Text("Awake").font(.system(size: 10)).foregroundColor(Color(red: 0.9058823529411765, green: 0.2980392156862745, blue: 0.23529411764705882, opacity: 1)).padding(.leading, 8.0).padding(.trailing, 0.0)
              Text("KWL").font(.system(size: 10)).foregroundColor(Color(red: 0.9019607843137255, green: 0.49411764705882355, blue: 0.13333333333333333, opacity: 1)).padding(.leading, 8.0).padding(.trailing, 0.0)
              Text("PWL").font(.system(size: 10)).foregroundColor(Color(red: 0.32941176470588235, green: 0.6745098039215687, blue: 0.8235294117647058, opacity: 1)).padding(.leading, 8.0).padding(.trailing, 0.0)
            }
            .frame(maxWidth: .infinity)
            VStack(alignment: .leading, spacing: 0) {
              Text("50m").font(.system(size: 10)).padding(.leading, 8.0).padding(.trailing, 0.0)
              Text("50m").font(.system(size: 10)).padding(.leading, 8.0).padding(.trailing, 0.0)
              Text("50m").font(.system(size: 10)).padding(.leading, 8.0).padding(.trailing, 0.0)
              Text("50m").font(.system(size: 10)).padding(.leading, 8.0).padding(.trailing, 0.0)
              Text("50m").font(.system(size: 10)).padding(.leading, 8.0).padding(.trailing, 0.0)
              Text("50m").font(.system(size: 10)).padding(.leading, 8.0).padding(.trailing, 0.0)
            }
            .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity)
    }
    .background(Image("widget_shape").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Text_widget_horz_Previews: PreviewProvider {
  static var previews: some View {
    Text_widget_horz()
  }
}
