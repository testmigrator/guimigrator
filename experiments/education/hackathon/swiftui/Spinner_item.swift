import SwiftUI

struct Spinner_item: View {
  var body: some View {
    Text("").font(.system(size: 20)).foregroundColor(Color(red: 0.9411764705882353, green: 0.5019607843137255, blue: 0.5019607843137255, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
  }
}

struct Spinner_item_Previews: PreviewProvider {
  static var previews: some View {
    Spinner_item()
  }
}
